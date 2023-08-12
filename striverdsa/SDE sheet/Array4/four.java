import java.util.HashMap;

class four {
    public static void main(String[] args) {
        // Length of the longest subarray with zero Sum
        // Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

        int[] arr = {9, -3, 3, -1, 6, -5};

        System.out.println(BruteForce(arr));
    }

    public static int BruteForce(int[] arr) {
        int max =0;
        for(int i=0; i<arr.length; i++) {
            int sum =0;
            for(int j=i ;j<arr.length; j++) {
                sum +=arr[j];
                if(sum == 0) {
                    max  = Math.max(max, (j - i + 1));
                }
            }
        }
        return max;
    }

    public static int Optimal(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0; 

        for(int i = 0;i<n;i++) {

            sum += A[i]; 

            if(sum == 0) {
                maxi = i + 1; 
            }
            else {
                if(mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum)); 
                }
                else {

                    mpp.put(sum, i); 
                }
            }
        }
        return maxi; 
    }
}