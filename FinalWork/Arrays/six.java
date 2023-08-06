import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class six {
    public static void main(String[] args) {
        // check if there exist a pair which matches the given sum

        int[ ] arr = {12, 3, 5, 1, 9};
        // SimpleMethod1(arr, 10);
        // SimpleMethod2(arr, 10);
        // UsingHashList(arr, 10);
        // SortingTechnoique(arr, 10);
    }

    public static void SimpleMethod1(int[] arr, int key) {
        // N^2
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                if((arr[j] + arr[i] )== key && i!=j) {
                    System.out.println("SUCCESS");
                    System.out.println("("+arr[i]+","+arr[j]+") = "+key);
                }
            }
        }
    }

    public static void SimpleMethod2(int[] arr, int key) {
        for(int i=0; i<arr.length; i++) {
            int ref = key - arr[i];
            for(int j=i; j<arr.length; j++) {
                if(arr[j] == ref && i!=j) {
                    System.out.println("SUCCESS");
                    System.out.println("("+arr[i]+","+arr[j]+") = "+key);
                }
            }
        }
    }

    public static void SortingTechnoique(int[] arr, int key) {
        // sorting = NlogN
        // matching = N
        // Overall time complexity = NlogN

        Arrays.sort(arr);

        int start = 0, end = arr.length -1;
        
        while(start < end) {
            int ref = arr[start] + arr[end];
            if(ref == key) {
                System.err.println("("+arr[start]+","+arr[end]+") = "+key);
                return;
            } else if(ref > key) {
                end --;
                ref =0;
            } else {
                start ++;
                ref=0;
            }
        }
    }

    // public static void UsingHashList(int[] arr, int key) {

    //     // not effeicent
    //     Set<Integer> H = new HashSet<>();

    //     for(int i=0; i<arr.length; i++) {
    //         H.add(arr[i]);
    //     }
    //     for(int i=0; i<arr.length; i++) {
    //         int ref = key - arr[i];
    //         if(H.contains(ref)) {
    //             System.out.println("SUCCESS");
    //             System.out.println("("+arr[i]+","+ref+") = "+key);
    //         }
    //     }
    // }

    public static void UsingHashList(int[] arr, int key) {
        // Tiem - N
        // Space - N
        // Effectient
        Set<Integer> H = new HashSet<>();

        for(int i=0; i<arr.length; i++) {
            int ref = key - arr[i];
            if(H.contains(ref)) {
                System.out.println("SUCCESS");
                System.out.println("("+arr[i]+","+ref+") = "+key);
                return;
            } else {
                H.add(arr[i]);
            }
        }
    }

}
