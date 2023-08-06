import java.util.*;

public class seventeen {
    public static void main(String[] args) {
        // video - 50 - first missing positive number 

        int[] arr = {-2, 11, 1, -3, 2, 10, 4}; // -3 -2 1 2 4 10 11 // j =2
        // Arrays.sort(arr);
        // int j=1;
        // int i=0;
        // while(i<arr.length) {
        //     if(arr[i] <= 0) {
        //         i++;
        //     } else {
        //         if(arr[i] == j) {
        //             j++;
        //             i++;
        //         } else {
        //             System.out.println("success :" +j+" is missing");
        //             return ;
        //         }
        //     }
        // }

        List <Integer> L = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            L.add(arr[i]);
        }
    
        int i=1;
        while(i<=arr.length) {
            if(L.contains(i)) {
                i++;
            } else {
                System.out.println("Missing first positive Integer : "+i);
                return;
            }
        }
        System.out.println("Missing first positive Integer : "+(i+1));

    }
}
