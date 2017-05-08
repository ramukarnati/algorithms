package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/14/17.
 */
@RunWith(JUnit4.class)
public class LongestRepeatingSubstringTest {
    @Test
    public void findLengthOfLongestRepeatingSubstring() throws Exception {
        String s = "adefabeabc";
        LongestRepeatingSubstring lrs = new LongestRepeatingSubstring();
        Assert.assertEquals(lrs.findLengthOfLongestRepeatingSubstring(s), 3);

    }

    @Test
    public void findLengthOfLongestRepeatingSubstringDP() throws Exception {
        String s = "aaaaaa";
        LongestRepeatingSubstring lrs = new LongestRepeatingSubstring();
        Assert.assertEquals(lrs.findLengthOfLongestRepeatingSubstringDP(s), 4);

    }

}