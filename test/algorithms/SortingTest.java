package algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/**
 * Created by rkarnati on 4/8/17.
 */
@RunWith(JUnit4.class)
public final class SortingTest {

    @Test
    public void testSorting(){

        int[] arr = {2,4,1,3,6,8,5};
        HeapSort hpSort = new HeapSort(arr);
        QuickSort qSort = new QuickSort(arr);
        Assert.assertArrayEquals(hpSort.sort(), qSort.sort());
    }
}
