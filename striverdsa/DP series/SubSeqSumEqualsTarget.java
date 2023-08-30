import java.util.Arrays;

public class SubSeqSumEqualsTarget {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length -1;
        int target = 10;
        boolean[][] DP = new boolean[n+1][target+1];
        for(int i =0; i<n; i++) {
            for(int j=0 ; j<target; j++) {
                DP[i][j] = false;
            }
        }

        System.out.println(MySolutionRecu(arr, target, n));
        System.out.println(MySolutionMemo(arr, target, n, DP));
        System.out.println(MySolutionTabula(arr, target, n+1));

    }

    // tabulation
    public static boolean MySolutionTabula(int[] arr, int target, int n) {
        boolean[][] DP = new boolean[n][target+1];
        for(int i =0; i<n; i++) {
            DP[i][0] = true;
        }
        DP[0][arr[0]] = true;

        for(int i =1; i<n; i++) {
            for(int j=1 ; j<=target; j++) {

                boolean nottake = DP[i-1][j];
                boolean take = false;
                if(arr[i] <= j) {
                    take = DP[i-1][j-arr[i]];;
                }
            
                DP[i][j] = take || nottake;
            }
        }

        // for(int i =0; i<n; i++) {
        //     for(int j=0 ; j<=target; j++) {
        //         System.out.print(DP[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        return DP[n-1][target];
    }


    // memoization
    public static boolean MySolutionMemo(int[] arr, int target, int index, boolean[][] DP) {
        // time : O()
        if(target == 0) return true;
        if(index == 0) return arr[0] == target;
        if(DP[index][target] != false) return DP[index][target];

        boolean nottake = MySolutionRecu(arr, target, index -1 );
        boolean take = false;
        if(target >= arr[index]) {
            target -= arr[index];
            take = MySolutionRecu(arr, target, index - 1);;
        }

        return DP[index][target] = take || nottake;
    }


    // recursion
    public static boolean MySolutionRecu(int[] arr, int target, int index) {
        // time : O(2^n)
        if(target == 0) return true;
        if(index == 0) return arr[0] == target;

        boolean nottake = MySolutionRecu(arr, target, index -1 );
        boolean take = false;
        if(target >= arr[index]) {
            target -= arr[index];
            take = MySolutionRecu(arr, target, index - 1);;
        }

        return take || nottake;
    }
}
