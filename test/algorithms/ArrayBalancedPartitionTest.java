package algorithms;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rkarnati on 4/16/17.
 */
public class ArrayBalancedPartitionTest {
    @Test
    public void findIfSubsetWithSum() throws Exception {

        int[] a = {6, 1, 11, 5};
        ArrayBalancedPartition arrayBalancedPartition = new ArrayBalancedPartition();
        Assert.assertTrue(arrayBalancedPartition.findIfSubsetWithSum(a, 17));
    }

    @Test
    public void findMinNonRecursive() throws Exception {

        int[] a = {6, 1, 11, 5};
        ArrayBalancedPartition arrayBalancedPartition = new ArrayBalancedPartition();
        Assert.assertEquals(arrayBalancedPartition.findMinNonRecursive(a), 1);
    }

    @Test
    public void findMinimumSum() throws Exception {

        int[] a = {6, 1, 11, 5};
        ArrayBalancedPartition arrayBalancedPartition = new ArrayBalancedPartition();
        //Assert.assertEquals(arrayBalancedPartition.findMinimumSum(a), 1);
    }

}