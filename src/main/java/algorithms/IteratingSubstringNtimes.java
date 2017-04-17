package algorithms;

import java.util.HashMap;

/**
 * Created by rkarnati on 4/14/17.
 */
public class IteratingSubstringNtimes {


    public boolean subStringIteratingNTimes(String s) {
        boolean isRepeat = false;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int prev = 0;
        int curr = 0;

        int i = 0;
        while (i < s.length()) {
            if (map.containsKey(s.charAt(i))) {
                prev = map.get(s.charAt(i));
                curr = isVaidString(i, prev, s);
                if (curr == s.length()-1) {
                    return true;
                } else {
                    i = curr;
                }
            } else {
                map.put(s.charAt(i), i);
            }
            i++;
        }
        return isRepeat;
    }
    public int isVaidString(int p, int q, String s) {
        while (s.charAt(p) == s.charAt(q) && p < s.length() - 1) {
            p = p+1;
            q = q+1;
        }
        return p;
    }


    public boolean subStringNTimes(String s) {

        int i = 0;
        int j = 1;
        while (j < s.length()) {
            while (s.charAt(i) == s.charAt(j) && j < s.length() - 1) {
                i = i+1;
                j = j+1;
            }
            if (s.charAt(i) == s.charAt(j) && j == s.length() -1) {
                return true;
            } else {
                i = 0;
            }
            j++;
        }
        return false;
    }

}
