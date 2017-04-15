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
        String subString = "";

        for (int p =0;p <str.length()/2;p++) {
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
        if (s.length() ==1|| s.length() ==0) return false;
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

}
