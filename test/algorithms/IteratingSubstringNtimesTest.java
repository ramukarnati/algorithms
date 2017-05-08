package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/14/17.
 */
@RunWith(JUnit4.class)
public class IteratingSubstringNtimesTest {
    @Test
    public void subStringTteratingNTimes() throws Exception {

        String s = "abcabcabc";
        IteratingSubstringNtimes it = new IteratingSubstringNtimes();
        //Assert.assertTrue(it.subStringIteratingNTimes(s));
        Assert.assertTrue(it.subStringNTimes(s));

    }

}