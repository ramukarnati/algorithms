package algorithms;

/**
 * Created by rkarnati on 4/10/17.
 */
public class RepeatedSubstringPattern {

    public boolean findIfRepeatedSubStringPat(String s) {
        boolean patRep = false;
        String pattern = "";
        char[] strChars = s.toCharArray();

        int i = 0;
        int j = 0;
        int diff = 0;
        int k = j+1;
        String target = "";
        while (j < (s.length()/2)){
            target = "";
            pattern = s.substring(i, j+1);

            for (int p =0;p<s.length()/pattern.length();p++){
                target += pattern;
            }
            if (target.equals(s)) {
                patRep = true;
                return patRep;
            }
            j++;
        }


        return patRep;
    }

}
