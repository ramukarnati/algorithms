package algorithms;

public class HeapSort {
    int[] arr = null;
    int heapSize = 0;

    public HeapSort(int[] arr){
        this.arr = arr;
        this.heapSize = arr.length;
    }

    public int[] sort(){
        buildHeapify();
        for (int i = heapSize-1;i>0;i--){
            exchange(i, 0);
            heapSize = heapSize -1;
            maxHeapify(0, heapSize);

        }
        return arr;
    }
    private void buildHeapify(){
        for (int i = heapSize/2;i>=0;i--){
            maxHeapify(i, heapSize);
        }
    }
    private void maxHeapify(int index, int heap){
        int left = left(index);
        int right = right(index);
        int largest = 0;
        if (left<heap && arr[left] > arr[index]) {
            largest = left;
        } else {
            largest = index;
        }
        if (right<heap && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != index) {
            exchange(largest, index);
            maxHeapify(largest, heap);
        }
    }

    private int left(int index){
       return (2*index);
    }

    private int right(int index){
        return (2*index) +1 ;
    }

    private void exchange(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}