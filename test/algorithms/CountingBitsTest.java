package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by rkarnati on 4/11/17.
 */
@RunWith(JUnit4.class)
public class CountingBitsTest {

    @Test
    public void testCountingBits() {
        CountingBits cb = new CountingBits();
        int[] expected = {0,1,1};
        Assert.assertArrayEquals(cb.countBits(2), expected);
    }
}
