// import java.util.Arrays;

import java.util.HashSet;
// import java.util.Set;

public class twevel {
    public static void main(String[] args) {
        // check if the multiple of any two number matches to the given value

        // int[] arr = {4, 1, 3, 10, 7, 8};
        int[] arr = {-5, -3, 1, 4, 7, 8 };
        int key = 15;

        // // brute force
        // for(int i=0; i<arr.length; i++) {
        //     for(int j=i; j<arr.length; j++) {
        //         if((arr[i] * arr[j]) == key) {
        //             System.out.println("SUCCESS");
        //             System.out.println(arr[i]+" x "+arr[j]+" = "+key);
        //         }
        //     }
        // }

        //---------------------------------------------------------------------------------------------------------------

        // using sorting // this works fine only for positive values // [ -5, -3, 1, 4, 7, 8 ] key = 15
        // Arrays.sort(arr);
        // int start =0, end = arr.length-1;

        // while(start < end) {
        //     if((arr[start] * arr[end]) == key) {
        //         System.out.println(arr[start]+" x "+arr[end]+" = "+key);
        //         start++;
        //         end--;
        //     } else if((arr[start] * arr[end]) < key) {
        //         start++;
        //     } else {
        //         end--;
        //     }
        // }

        //---------------------------------------------------------------------------------------------------------------

        // using Hash set
        // time = N
        // space = N

        HashSet<Integer> H = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            int ref =0;
            if(( key % arr[i] ) == 0) { // done
                ref =  ( key / arr[i] );
            }
            
            if(H.contains(ref)) {
                System.out.println(arr[i]+" x "+ref+" = "+key); // problrm eruku (solved)
            } 
            H.add(arr[i]);    // important
        }

    }
}
