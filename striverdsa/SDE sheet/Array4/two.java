import java.util.*;

class two {
    public static void main(String[] args) {
        
        // 4 Sum | Find Quads that add up to a target value
        // Problem Statement: Given an array of N integers, your task is to find unique quads that add up to give a target value. In short, you need to return an array of all the unique quadruplets [arr[a], arr[b], arr[c], arr[d]] such that their sum is equal to a given target.

        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        // List<List<Integer>> ans = BruteForce(arr, target);
        // List<List<Integer>> ans = Optimal(arr, target);
        List<List<Integer>> ans = Mysolution(arr, target);


        if(ans.isEmpty()) {
            System.out.println("No Pair Exist");
            return;
        }

        for(List<Integer> l : ans) {
            System.out.print("[");
            for(int i : l) {
                System.out.print(" "+i);
            }
            System.out.println(" ]");
        }

    }

    public static List<List<Integer>> BruteForce(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> S = new HashSet<>();

        for(int i=-0; i<n; i++) {
            for(int j= i+1; j<n; j++) {
                for (int k = j+1; k<n; k++) {
                    for(int l =k+1; l<n; l++) {
                        long sum = (long)arr[i] + arr[j];
                        sum += arr[k];
                        sum += arr[l];

                        if(sum == target) {
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(temp);
                            S.add(temp);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(S);
    }

    public static List<List<Integer>> Optimal(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> S = new HashSet<>();

        for(int i=0; i<n; i++) {
            for(int j= i+1; j<n; j++) {
                Set<Integer> H = new HashSet<>();
                for (int k = j+1; k<n; k++) {
                    if(H.contains(target - (arr[i] +arr[j] +arr[k]))) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], (target - (arr[i] +arr[j] +arr[k])));
                        temp.sort(Integer :: compareTo);
                        S.add(temp);
                    }
                    H.add(arr[k]);
                }
            }
        }

        return new ArrayList<>(S);
    }

    public static List<List<Integer>> Mysolution(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> S = new HashSet<>();
        Arrays.sort(arr);
        // -2, -1, 0, 0, 1, 2

        for(int i=0; i<n; i++) {
            if( i > 0 && arr[i] == arr[i-1]) continue;    // important
            for(int j=i+1; j<n; j++) {
                if( j > i+1 && arr[j] == arr[j-1]) continue;    // important
                int k = j+1;
                int l = n-1;
                while(k<l) {
                    long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        S.add(temp);
                        k++;
                        l--;

                        while (k < l && arr[k] == arr[k - 1]) k++;  // important
                        while (k < l && arr[l] == arr[l + 1]) l--;  // important
                    } else if(sum < target) k++;
                    else l--;
                }
            }
        }

        return new ArrayList<>(S);
    }
}