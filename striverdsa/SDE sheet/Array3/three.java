import java.util.HashMap;
import java.util.Map;

// only one element can appear as a mojority more than n/2 time

class three { 
    public static void main(String[] args) {
        // Find the Majority Element that occurs more than N/2 times
        // Problem Statement: Given an array of N integers, write a program to return an element that occurs MORE than N/2 times in the given array. You may consider that such an element always exists in the array.

        // int[] arr = {3, 2, 3} ;
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        // System.out.println(BetterApproach(arr));
        System.out.println(Optimal(arr));
    }

    public static int Optimal(int[] arr) {
        // Moore voting algorithm
        int count =1, curr=arr[0];

        for(int i=1; i<arr.length; i++) {
            if(count == 0 && arr[i] != curr) {
                count ++;
                curr = arr[i];
            } else if(arr[i] == curr) {
                count ++;
            } else {
                count --;
            }
        }

        // if the question states that there will be a element for sure that is greater than (n/2) occurances. then we dont have to check it - over curre will be the answer. if the question does not state any assurance, then we have to check it again .
        int count1=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == curr) count1 ++;
        }
        return (count1 > (arr.length /2)) ? curr : -1;
    }

     public static int BetterApproach(int[] arr) {
        HashMap<Integer, Integer> H = new HashMap<>();

        for(int i =0; i<arr.length; i++) {
            int value = H.getOrDefault(arr[i], 0);
            H.put(arr[i], value +1);
        }

        for(Map.Entry<Integer, Integer> i : H.entrySet()) {
            if(i.getValue() > (arr.length /2)) {
                return i.getKey();
            }
        }

        return -1;
     }
}