package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/10/17.
 */

@RunWith(JUnit4.class)
public class FindWindowOfSubStringTest {

    @Test
    public void testMinWinod() {
        FindWindowOfSubString findWindowOfSubString = new FindWindowOfSubString();
        String min = findWindowOfSubString.minWindow("ADOBECODEBANC", "ABC");
        Assert.assertEquals("This is not working", min, "BANC");
    }
}
