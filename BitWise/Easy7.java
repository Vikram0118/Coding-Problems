import java.util.*;

public class Easy7 {
    public static void main(String[] args) {
        // int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        // int arr[] = {5, 7, 2, 7, 5, 2, 5};
        // int arr[] = new int[]{1, 2, 3, 4, 4};
        // int n = arr.length;
        // System.out.println("The number that is occuring for a Odd times is : "+usingXOR(arr, n));

        int arr[] = {21, 22, 23, 24, 25, 21, 26};
        int n = arr.length;
        System.out.println(usingXORHasDup1(arr, n));   //  from 1 to n
        System.out.println(usingXORHasDup2(arr, n));   // for any consecuitive shuffled array
    }

    // method 1 - do hashing / Set

    // method 2 
    // The Best Solution is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring elements. 
    // there should be only one number there in odd occurance for sure
    static int usingXOR(int[] arr, int n) {
        int i;
        int res = 0;
        for (i = 0; i < n; i++){
            res = res ^ arr[i];
        }
        return res;
    }

    // -----------------------------------------------------------------------------------

    // XOR can be used to check if the array contains duplicate elements
    // condition - only one duplicate, number should range from 1 to n 
    static int usingXORHasDup1(int[] arr, int n) {
        int i;
        int res = 0;
        for (i = 0; i < n; i++) {
            res = res ^ arr[i];
        }

        for (i = 1; i < n; i++) {
            res = res ^ i;
        }
          
        return res;
    }

    // tp generalise - shuffled consecuitive numbers
    // step 1 : first find the minimum and maximum number in the array
    // step 2 : XOR the numbers between maximum and minimum elements
    static int usingXORHasDup2(int[] arr, int n) {
        int i;
        int res = 0; //  all the elements of the array
        int res2 = 0; // from maximum to minimum
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // finding the min and max number of a array
        for(i=0; i<n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        for(i= min ; i<=max; i++) {
            res2 ^= i;
        }

        for (i = 0; i < n; i++) {
            res = res ^ arr[i];
        }

        return res ^ res2;
    }
}
