package algorithms;

/**
 * Created by rkarnati on 4/11/17.
 */
public class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for (int i =0; i<=num;i++){
            result[i] = numOfOnes(i);

        }
        return result;
    }
    public int numOfOnes(int n){
        if (n ==0){
            return 0;
        }
        int counter = 0;
        while (n!=0){
            if ((n&1) == 1){
                counter++;
            }
            n>>=1;
        }
        return counter;
    }
}
