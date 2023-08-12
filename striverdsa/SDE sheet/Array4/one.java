import java.util.*;

class one  {
    public static void main(String[] args) {
        
        //Two Sum problem : Check if a pair with given sum exists in Array . Problem Statement: Given an array of integers arr[] and an integer target.

        // 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.

        // 2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

        int[] arr = {2, 6, 5, 8, 11};
        int target  = 14;
        System.out.println("BRUTE FORCE : ");
        System.out.println(BruteVariantOne(arr, target));
        int[] result = BruteVariantTwo(arr, target);
        System.out.println("["+result[0]+","+result[1]+"]");
        System.out.println();


        System.out.println("OPTIMAL : ");
        // System.out.println(OptimalVariantOne(arr, target));
        int[] result1 = OptimalVariantTwo(arr, target);
        System.out.println("["+result1[0]+","+result1[1]+"]");

    }

    // bruteForce
    public static boolean BruteVariantOne (int[] arr, int target) {
        Set<Integer> H = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++) {
            if(H.contains(target - arr[i])) {
                return true;
            } else {
                H.add(arr[i]);
            }
        }
        return false;
    }

    public static int[] BruteVariantTwo(int[] arr, int target) {
        Set<Integer> H = new HashSet<Integer>();

        for(int i=0; i<arr.length; i++) {
            H.add(arr[i]);
        }
        for(int i=0; i<arr.length; i++) {
            if(H.contains(target - arr[i])) {
                for(int j=0; j<arr.length; j++) {
                    if(arr[j] == (target - arr[i])) {
                        return new int[] {i , j};
                    }
                }
            }
        }
        return new int[] {-1, -1};
    }

    // optimal
    // public static boolean OptimalVariantOne (int[] arr, int target) {
    //     int i = 0, j= arr.length-1;
    //     Arrays.sort(arr);

    //     while(i<j) {
    //         if((arr[i]+arr[j]) > target) {
    //             j--;
    //         } else if((arr[i]+arr[j]) < target) {
    //             i++;
    //         } else {
    //             return true;
    //         }
    //     }
    //     return false;
    // }

    public static int[] OptimalVariantTwo(int[] arr, int target) {
        int i = 0, j= arr.length-1;
        int[][] IndexArr = new int[arr.length][2];
        for(int k=0; k<arr.length; k++) {
            IndexArr[k][0] = k;
            IndexArr[k][1] = arr[k];
        }
        Arrays.sort(arr);

        while(i<j) {
            if((arr[i]+arr[j]) > target) {
                j--;
            } else if((arr[i]+arr[j]) < target) {
                i++;
            } else {
                int a = -1, b =-1;
                for(int k=0; k<IndexArr.length; k++) {
                    if(IndexArr[k][1] == arr[i]) {
                        System.out.println(arr[i] +" "+IndexArr[k][1]+" "+IndexArr[k][0]+" "+k );
                        a = IndexArr[k][0];
                        break;
                    }
                }
                for(int k=0; k<IndexArr.length; k++) {
                    if(IndexArr[k][1] == arr[j]) {
                        b = IndexArr[k][0];
                        break;
                    }
                }
                return new int[] {a, b};
            }
        }
        return new int[] {-1, -1};
    }
}