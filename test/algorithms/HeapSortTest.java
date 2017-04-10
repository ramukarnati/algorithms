package algorithms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;

@RunWith(JUnit4.class)
public final class HeapSortTest{

    @Test
    public void testHeapSort() {

        int[] unsorted = {2, 4, 3, 7, 5, 1 };
        HeapSort hpSort = new HeapSort(unsorted);
        int[] sorted = hpSort.sort();
        Assert.assertEquals(sorted[0], 1 );
    }
}



