package algorithms;

import java.util.HashMap;

/**
 * Created by rkarnati on 4/10/17.
 */
public class FindWindowOfSubString {

    public String minWindow(String s, String t) {

        HashMap<Character, Integer> tar;
        tar = new HashMap();
        HashMap<Character, Integer> sou;
        sou = new HashMap();
        String result = "";
        int minLen = Integer.MAX_VALUE;
        for (int i = 0;i<t.length();i++){
            if (tar.containsKey(t.charAt(i))){
                tar.put(t.charAt(i), tar.get(t.charAt(i)) +1);

            } else {
                tar.put(t.charAt(i), 1);
            }
        }
        int counter = 0;
        int low = 0;
        for (int i =0;i<s.length();i++) {
            if (tar.containsKey(s.charAt(i))) {
                if (sou.containsKey(s.charAt(i))) {
                    if (tar.get(s.charAt(i)) > sou.get(s.charAt(i))) {
                        counter++;
                    }
                    sou.put(s.charAt(i), sou.get(s.charAt(i))+1);
                } else {
                    sou.put(s.charAt(i), 1);
                    counter++;
                }
            }
            if (counter == t.length()) {
                char sc = s.charAt(low);
                while (!sou.containsKey(sc) || tar.get(sc) < sou.get(sc)) {

                    low++;
                    if (tar.containsKey(sc) && tar.get(sc) < sou.get(sc)) {
                        sou.put(sc, sou.get(sc)-1);
                    }
                    sc = s.charAt(low);
                }
                if (i - low+1 < minLen){
                    result = s.substring(low, i+1);
                    minLen = i - low+1;
                }
            }


        }
        return result;
    }
}
