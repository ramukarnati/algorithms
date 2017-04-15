package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by rkarnati on 4/14/17.
 */
@RunWith(JUnit4.class)
public class LongestRepeatingSubstringTest {
    @Test
    public void findLengthOfLongestRepeatingSubstring() throws Exception {
        String s = "abcabcdef";
        LongestRepeatingSubstring lrs = new LongestRepeatingSubstring();
        Assert.assertEquals(lrs.findLengthOfLongestRepeatingSubstring(s), 3);

    }

}