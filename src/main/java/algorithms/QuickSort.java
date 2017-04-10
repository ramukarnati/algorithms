package algorithms;

/**
 * Created by rkarnati on 4/8/17.
 */
public class QuickSort {
    int[] arr = null;
    public QuickSort(int[] arr){
        this.arr = arr;
    }

    public int[] sort(){
        if (arr.length != 0) {
            sortQuick(0, arr.length);
        }
        return arr;
    }
    private void sortQuick(int low, int high) {
        if (low > high){
          int p = partion(low, high);
          sortQuick(low, p);
          sortQuick(p+1, high);
        }
    }

    public int partion(int p, int q) {
        int i = p-1;
        for (int j =0; j<q-1;j++ ){
            if (arr[j] < arr[q]){
                i = i+1;
                //exchange a[j] with a[i]
                exchange(j, i);
            }
        }
        exchange(q, i+1);
        return i+1;
    }

    public void exchange(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
