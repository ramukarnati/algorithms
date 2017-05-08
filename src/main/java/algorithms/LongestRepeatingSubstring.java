package algorithms;

import java.util.HashMap;

/**
 * Created by rkarnati on 4/14/17.
 */
public class LongestRepeatingSubstring {

    public int findLengthOfLongestRepeatingSubstring(String s){
        int length = 0;
        int maxLength = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i = 0;
        while (i < s.length() ) {
            if (map.containsKey(s.charAt(i))) {
                int prev = map.get(s.charAt(i));
                length = checkSubstring(prev, i, s);
                if (length > maxLength){
                    maxLength = length;
                }

            } else {
                map.put(s.charAt(i), i);
            }
            i++;
        }
        return maxLength;
    }

    public int checkSubstring(int p , int q, String  str){
        int conuter = 0;
        int endIndex = q;
        while (p < endIndex && q < str.length() && str.charAt(p) == str.charAt(q)){
            conuter++;
            p = p+1;
            q = q+1;
        }
        return conuter;
    }

    public int findLengthOfLongestRepeatingSubstringDP(String str) {
        int length = 0;
        int[][] table = new int[str.length()][str.length()];
        int maxLength = Integer.MIN_VALUE;
        int n = str.length();
        for (int i =1; i<str.length();i++) {
            for (int j =1;j<str.length();j++){
                if (i != j && str.charAt(i-1) == str.charAt(j-1)) {
                    length = 1 + table[i-1][j-1];
                    table[i][j] = length;
                    if (maxLength < length){
                        maxLength = length;
                    }
                }
            }
        }
        return maxLength;
    }
}
