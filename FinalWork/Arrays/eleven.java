import java.util.*;

public class eleven {
    public static void main(String[] args) {
        // Union of two sorted arrays

        // int[] arr1 = {2, 2, 2, 3, 3, 4, 7, 8};
        // int[] arr2 = {1, 2, 4, 4 , 6, 6 ,7, 8, 10};

        // // 1 - use Hash set - just store everything in both the arryas
        // Set<Integer> H = new HashSet<>();
        
        // for(int i=0; i<arr1.length; i++){
        //     H.add(arr1[i]);
        // }
        // for(int i=0; i<arr2.length; i++){
        //     H.add(arr2[i]);
        // }
        // System.out.println(H);

        // // 2 - 
        // List<Integer> L = new ArrayList<>();

        // int i=0, j =0;

        // while(i<arr1.length && j<arr2.length) {

        //     while(i<arr1.length-1 && arr1[i] == arr1[i+1]){
        //         i++;
        //     }
        //     while(j<arr2.length-1 && arr2[j] == arr2[j+1]){
        //         j++;
        //     }
            
        //     if(arr1[i] == arr2[j]) {
        //         L.add(arr1[i]);
        //         if(i<arr1.length)
        //             i++;
        //         if(j<arr2.length)
        //             j++;
        //     } else if (arr2[j] < arr1[i]) {
        //         L.add(arr2[j]);
        //         if(j<arr2.length)
        //             j++;
        //     } else {
        //         L.add(arr1[i]);
        //         if(i<arr1.length)
        //             i++;
        //     }
        // }

        // while(i<arr1.length) {
        //     while(i<arr1.length-1 && arr1[i] == arr1[i+1]){
        //         i++;
        //     }
        //     L.add(arr1[i]);
        //     i++;
        // }

        // while(j<arr2.length) {
        //     while(j<arr2.length-1 && arr2[j] == arr2[j+1]){
        //         j++;
        //     }
        //     L.add(arr2[j]);
        //     j++;
        // }

        // System.out.println(L);
 
        // ----------------------------------------------------------------------------------------------------------------------

        // Union of two unsorted arrays
        int[] arr1 = {4, 2, 3, 5, 4, 2, 3};
        int[] arr2 = {9, 1, 7, 2, 4, 2, 1, 2};

        // 1 - use Hash set - just store everything in both the arryas //  PROBLEM IS = " THE HASH SET AUTOMATICALLY SORTS THE VALUE INSODE IT"
        Set<Integer> H = new HashSet<>();
        
        for(int i=0; i<arr1.length; i++){
            H.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            H.add(arr2[i]);
        }
        System.out.println(H);


        //2 


    }
}
