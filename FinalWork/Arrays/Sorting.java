
public class Sorting extends Utils {
    public static void main(String[] args) {
        
        // Sorting o = new Sorting();
        // int[] arr = {3, 2, 4, 7, 55, 6, 2, 10};

        // o.BubbleSort(arr);
        // o.InsertionSort(arr);
        // o.SelectionSort(arr);
        // o.QuickSort(arr, 0, arr.length-1);
        // o.MergeSort(arr, 0, arr.length);
        int[] arr = {2, 3, 1, 4, 6, 5};
        CyclicSort(arr); // only for sorting of 1 to n number 

        print(arr);
    }
    
    public void BubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i] > arr[j])
                    swap(arr, i, j);
            }
        }
    }

    public void InsertionSort(int[] arr) {

        for(int i=1; i<arr.length; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public void SelectionSort(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            int temp = Integer.MAX_VALUE;
            int ref = i;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] < temp){
                    temp = arr[j];
                    ref = j;
                }
            }
            swap(arr, i, ref);
        }
    }

    public void QuickSort(int[] arr, int start, int end) {

        // Time complexity - NlogN, BUt if the array is already is sorted manner then it will be N^2.

        int i, j, pivot;

        if(start < end) {
            pivot = start;
            i= start ;
            j = end;

            while(i<j){
                while(arr[i] <= arr[pivot] && i<end){
                    i++;
                }
                while(arr[i] > arr[pivot] && arr[j] > arr[pivot] && j>=0) {
                    j--;
                }
                if(i<j && arr[j] < arr[pivot]){
                    swap(arr, i, j);    
                }
            }
            swap(arr, j, pivot);

            QuickSort(arr, start, j-1);
            QuickSort(arr, j+1, end);
        }
    }

    public void MergeSort(int[] arr, int start, int end) {
        // Time complecity = NlogN

        if(start != end) {
            int mid = (start + end) / 2;
            MergeSort(arr, start, mid);
            MergeSort(arr, mid + 1, end);
            Merge(arr, start, mid, end);
        }
    }

    public void Merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j= mid + 1;
        int k =0;

        int[] temp = new int[end - start +1];
        
        while( i<=mid && j<=mid) {
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];                
            }
        }

        while(i<=mid) {
            temp[k++] = arr[i++];
        }

        while(j<=end) {
            temp[k++] = arr[j++];
        }

        for( i= start; i<= end; i++){
            arr[i] = temp[i - start];   // important
        }
    }

    public static void CyclicSort(int[] arr) {
        //  Only for a small range of values // sorting of 1 to n
        // {2, 3, 1, 4, 6, 5}
        int i=0;
        while(i<arr.length) {
            if(arr[i] == i + 1){
                i++;
            } else {
                swap(arr, i, arr[i] - 1); // careful
            }
        }
    }
}
