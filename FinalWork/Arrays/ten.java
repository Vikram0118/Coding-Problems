import java.util.ArrayList;
// import java.util.HashSet;
import java.util.List;
// import java.util.Set;

public class ten {
    public static void main(String[] args) {

        // intersection of two sorted arrays
        // Time - ( N + M )
        int[] arr1 = {2, 2, 2, 3, 3, 4, 7, 8};   // - length = N
        int[] arr2 = {1, 2, 4, 4, 6, 6, 7, 8, 10};  // - length = M
        List<Integer> L = new ArrayList<>();

        int i = 0, j =0;

        while(i<arr1.length && j<arr2.length) { // && - Because it is Intersection

            while(i<arr1.length -1 && arr1[i] == arr1[i+1]){
                i++;
            }
            while(j<arr2.length -1 && arr2[j] == arr2[j+1]){
                j++;
            }
            if(arr1[i] == arr2[j]) {
                L.add(arr1[i]);
                i++;
                j++;
            } else if(arr2[j] < arr1[i]) {
                j++;
            } else {
                i++;
            }
        }

        System.out.println(L);


        //------------------------------------------------------------------------------------------------------------

        // Intersectio of two unsorted arrays
        // Time - ( N + M )
        // space - ( N + M ) - sets

        // int[] arr1 = {4, 2, 3, 5, 4, 2, 3};
        // int[] arr2 = {9, 1, 7, 2, 4, 2, 1, 2};
        // // 1 - sort this and do the above things :)
        // // 2 - use Hash

        // Set<Integer> H = new HashSet<>(); 
        // Set<Integer> L = new HashSet<>(); 
        // // List<Integer> L = new ArrayList<>(); // its repeating

        // for(int i=0; i<arr1.length; i++) {
        //     H.add(arr1[i]);
        // }

        // for(int i=0; i<arr2.length; i++) {
        //     if(H.contains(arr2[i])) {
        //         L.add(arr2[i]);
        //     }
        // }
        // System.out.println(L);
    }
}
