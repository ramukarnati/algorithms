package algorithms;

/**
 * Created by rkarnati on 4/10/17.
 */
public class ReverseBits {


    public long reverseBits(long n){
        long result = 0;
        if (n == 0){
            return result;
        }
        for (int i =0;i<32;i++){
            result <<= 1;
            if ((n&1) == 1) {
                result = result + 1;
            }
            n >>= 1;
        }

        return result;
    }
}
