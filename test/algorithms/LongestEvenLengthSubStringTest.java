package algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

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

}