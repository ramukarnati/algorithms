package algorithms;

import java.util.HashMap;
import java.util.List;

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
                length = checkSubstring(i, prev, s);
                if (length > maxLength){
                    maxLength = length;
                }
                map.put(s.charAt(i), i);
                i = i + length -1;
            } else {
                map.put(s.charAt(i), i);
            }
            i++;
        }

        return maxLength;

    }

    public int checkSubstring(int p , int q, String  str){
        int conuter = 0;

        while (str.charAt(p) == str.charAt(q)){
            conuter++;
            p = p+1;
            q=q+1;
        }
        return conuter;



    }


}
