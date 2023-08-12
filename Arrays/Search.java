import java.util.*;

public class Search extends Utils{
    public static void main(String[] args) {

        Search o = new Search();
        int[] arr= {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // o.LinearSearch(arr, 51);
        o.BinarySearch(arr, 9);
        
    }

    public void LinearSearch(int[] arr, int key) {

        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                System.out.println(key +" present at position "+ (i+1));
                return;
            }
        }
        System.out.println("Search unsuccessfull, Element not present");
    }

    public void BinarySearch(int[] arr, int key) {

        int start = 0, end = arr.length, mid;
        Arrays.sort(arr);

        while(start<=end){
            mid = (start + end) / 2;
            if(arr[mid] == key) {
                System.out.println(key +" present at position "+ (mid+1));
                return;
            } else if(arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("Search unsuccessfull, Element not present");
    }
}
