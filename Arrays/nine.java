import java.util.*;

public class nine {
    public static void main(String[] args) {

        // first repeating value of an array

        // time = N
        // space = N

        int[] arr = {2, 3, 4, 4, 3, 5, 7};
        Set<Integer> H = new HashSet<>(); 

        // if i want the answer to be 4 
        // for(int i=0; i<arr.length; i++) {
        //     if(H.contains(arr[i])) {
        //         System.out.println("The first repeating value is "+arr[i]);
        //         return;
        //     } else {
        //         H.add(arr[i]);
        //     }
        // }

        // if i want it to be 3 
        int ans = -1;
        for(int i=0; i<arr.length; i++) {
            if(H.contains(arr[i])) {
                ans = arr[i];
            } else {
                H.add(arr[i]);
            }
        }
        System.out.println((ans == -1) ? "There is noo repeating value in the array" : "The first repeating value is "+ans);

        // Other methods are also there
    }
}