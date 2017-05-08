package algorithms;

/**
 * Created by rkarnati on 4/13/17.
 *
 * Longest Even Length Substring such that Sum of First and Second Half is same
 */
public class LongestEvenLengthSubString {

    public int findLongestEvenLengthSubString(String str) {

        int length = 0;

        int i = 0;
        int j = 0;
        String subString;

        for (int p =0;p<str.length()/2;p++) {
            j = p;
            while (j < str.length()-1) {
                subString = str.substring(p, j);
                if (checkIfStrIsValid(subString)) return subString.length();
                j = j+2;
            }
        }
        return length;
    }
    private boolean checkIfStrIsValid(String s){
        if (s.length() == 1 || s.length() == 0) return false;
        String first = s.substring(0, s.length()/2);
        String second = s.substring(s.length()/2, s.length());
        int firstSum = 0;
        int secondSum = 0;
        for (int i =0;i<first.length();i++){
            firstSum += Integer.parseInt(String.valueOf(first.charAt(i)));
            secondSum += Integer.parseInt(String.valueOf(second.charAt(i)));
        }
        return firstSum == secondSum;
    }


    public int findLOngestEvenLengthSubStringDP(String str){
        int len = 0;
        int maxLen = Integer.MIN_VALUE;
        int k = 0;

        int[][] table = new int[str.length()][str.length()];
        for (int i = 0; i<str.length();i++) {
            for (int j = i; j < str.length(); j++) {
                if (i == j) {
                    table[i][j] = Integer.parseInt(String.valueOf(str.charAt(i)));
                } else {
                    table[i][j] = table[i][j - 1] + Integer.parseInt(String.valueOf(str.charAt(j)));
                }
            }
        }
        for (int i = 0; i<str.length();i++) {
            for (int j = i; j < str.length();j++) {
                if ((i%2==0&&(j+1)%2==0) || (i%2!=0&&(j+1)%2!=0)) {
                    k = (i+j)/2;
                    if (table[i][k] == table[k+1][j]) {
                        len = j - i+1;
                        if (len > maxLen) {
                            maxLen = len;
                        }
                    }
                }
            }
        }
        return maxLen;
    }

    private int covertStringToIntSum(String s){
        int sum = 0;
        for (int i =0;i<s.length();i++){
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }

}
