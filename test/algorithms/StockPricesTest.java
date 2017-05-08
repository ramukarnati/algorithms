package algorithms;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rkarnati on 4/13/17.
 */
public class StockPricesTest {
    @Test
    public void findMaxProfit() throws Exception {

        int[] stockPrices = {2, 10, 70, 1, 80, 30, 40};
        StockPrices sp = new StockPrices();
        Assert.assertEquals(sp.findMaxProfit(stockPrices), 79);

    }

}