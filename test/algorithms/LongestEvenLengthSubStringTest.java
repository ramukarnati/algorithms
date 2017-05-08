package algorithms;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rkarnati on 4/13/17.
 */
public class LongestEvenLengthSubStringTest {
    @Test
    public void findLongestEvenLengthSubString() throws Exception {

        String str = "123123";
        LongestEvenLengthSubString longestEvenLengthSubString = new LongestEvenLengthSubString();
        //Assert.assertEquals(longestEvenLengthSubString.findLongestEvenLengthSubString(str), 6);
        Assert.assertEquals(longestEvenLengthSubString.findLongestEvenLengthSubString("1538023"), 4);
    }


    @Test
    public void findLOngestEvenLengthSubStringDP() throws Exception {
        String str = "123123";
        LongestEvenLengthSubString longestEvenLengthSubString = new LongestEvenLengthSubString();
        Assert.assertEquals(longestEvenLengthSubString.findLOngestEvenLengthSubStringDP(str), 6);

    }
}