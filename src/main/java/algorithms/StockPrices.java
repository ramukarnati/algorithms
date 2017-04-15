package algorithms;

/**
 * Created by rkarnati on 4/13/17.
 */
public class StockPrices {

    public int findMaxProfit(int[] stockprices){

        int maxProfit = Integer.MIN_VALUE;
        int profit = 0;
        int curMin = stockprices[0];
        int counter = 1;
        while (counter<stockprices.length){
            if (stockprices[counter] < curMin  ) {
                curMin = stockprices[counter];
            } else {
                profit = stockprices[counter]-curMin;
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
            counter++;
        }
        return maxProfit;
    }

}
