package algorithms;

import java.util.HashMap;

/**
 * Created by rkarnati on 4/10/17.
 */
public class SubStringWithKRepeating {

    public String findSubstringWithKRepeatingChars(String s, int k) {
        String result = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Boolean> freq = new HashMap<Character, Boolean>();
        int count = 0;
        for (int i =0; i < s.length();i++) {
            count = 0;
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) +1);
                count = map.get(s.charAt(i));
            } else {
                map.put(s.charAt(i), 1);
                count = 1;
            }

            if (count < k){
                freq.put(s.charAt(i), false);
            } else {
                freq.put(s.charAt(i), true);
            }
        }

        int i = 0;
        int j = s.length()-1;
        result = s.substring(i, j+1);
        int same = 0;
        int diff = 0;
        if (!freq.containsValue(true)){
            return "";
        }

        while (freq.containsValue(false) && i < s.length() && j > 0) {
            char sci = s.charAt(i);
            char scj = s.charAt(j);

            if(!freq.get(sci)){
               i = i+1;
               map.put(sci, map.get(sci) -1);
               if (map.get(sci) == 0){
                   freq.remove(sci);
               } else {
                   freq.put(sci, map.get(sci) >= k);
               }
            } else if (!freq.get(scj)) {
                j = j-1;
                map.put(scj, map.get(scj) -1);
                if (map.get(scj) == 0){
                    freq.remove(scj);
                } else {
                    freq.put(scj, map.get(scj) >= k);
                }

            } else {

                same = i+1;
                while (freq.get(s.charAt(same)) && same < s.length()) {
                    same++;
                }
                diff = same - i;
                same = j -1;
                while (freq.get(s.charAt(same)) && same  > 0) {
                    same--;
                }
                if (diff < (j-same)) {
                    i = i+1;
                    map.put(sci, map.get(sci) -1);
                    if (map.get(sci) == 0){
                        freq.remove(sci);
                    } else {
                        freq.put(sci, map.get(sci) >= k);
                    }
                } else {
                    j = j-1;
                    map.put(scj, map.get(scj) -1);
                    if (map.get(scj) == 0){
                        freq.remove(scj);
                    } else {
                        freq.put(scj, map.get(scj) >= k);
                    }
                }
            }
            result = s.substring(i, j+1);

        }

        return result;
    }
}
