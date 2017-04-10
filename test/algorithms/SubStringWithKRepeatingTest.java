package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/10/17.
 */

@RunWith(JUnit4.class)
public class SubStringWithKRepeatingTest {


    @Test
    public void testSubStringWithKRepeating() {
        SubStringWithKRepeating subStringWithKRepeating = new SubStringWithKRepeating();
        Assert.assertEquals(subStringWithKRepeating.findSubstringWithKRepeatingChars("caaaacac", 4), "aaaa");
    }
}
