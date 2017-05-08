package algorithms;

/**
 * Created by rkarnati on 4/16/17.
 */
public class ArrayBalancedPartition {


    public int findMinimumSum(int[] a) {
        int minSum = 0;
        int currSum = 0;
        int totalSum = 0;
        for (int i =0;i<a.length;i++) {
            totalSum += a[i];
        }
        return getMinimumSum(a, a.length, totalSum, currSum);
    }

    private int getMinimumSum(int[]a, int length, int totalSum, int currentSum) {
        if (length == 0) {
            return Math.abs((totalSum-currentSum) - currentSum);
        }
         return Math.min(getMinimumSum(a, length-1, totalSum, currentSum),
                 getMinimumSum(a, length-1,totalSum, currentSum+a[length-1]));
    }

    public int findMinNonRecursive (int[] a){ // {6, 1, 5, 11}
        int min = 0;
        int totalSum = 0;
        for (int i =0;i<a.length;i++) {
            totalSum += a[i];
        }
        boolean[] aSum = new boolean[totalSum+1];
        //aSum[i] is true if there is a set in given array that adds up to value i.
        aSum[0] = true;
        for (int i = 0;i<a.length;i++){
            for (int j = aSum.length-a[i]; j >= 0; j--) {
                if (aSum[j]) aSum[j + a[i]] = true;
            }
        }

        for (int i =aSum.length-2;i>=0;i--) {
            if (aSum[i]) min = aSum.length - i;
        }
        return min;

    }

    public boolean findIfSubsetWithSum(int[] a, int sum) {
        if (sum == 0) {
            return true;
        }
        return findSubSet(a, a.length, sum);

    }
    private boolean findSubSet(int[]a, int length, int sum) {
        if (sum == 0) return true;
        if (length == 0 && sum > 0) return false;
        if (sum < 0 && length != 0) return true;

        return findSubSet(a, length-1, sum-a[length-1]) ||  findSubSet(a, length-1, sum);
    }

}
