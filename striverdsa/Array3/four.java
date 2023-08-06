import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// only two element can appear as a mojority more than n/3 time


class four {
    public static void main(String[] args) {
        // Majority Elements(>N/3 times) | Find the elements that appears more than N/3 times in the array
        // Problem Statement: Given an array of N integers. Find the elements that appear more than N/3 times in the array. If no such element exists, return an empty vector.

        // int[] arr = {1, 2, 2, 3, 2};
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> L = MySolution(arr);

        for(int i =0; i<L.size(); i++) {
            System.out.println(L.get(i));
        }

    }

    public static List<Integer> MySolution (int[] arr) {
        List<Integer> L = new ArrayList<>() ;
        HashMap<Integer, Integer> H = new HashMap<>();
        int mini = (arr.length/3) +1;

        for(int i=0; i<arr.length; i++) {
            int value = H.getOrDefault(arr[i], 0);
            H.put(arr[i], value +1);

            if(H.get(arr[i]) == mini) {
                L.add(arr[i]);
            }
            if(L.size() == 2){
                break;
            }
        }

        return L;
    }
}