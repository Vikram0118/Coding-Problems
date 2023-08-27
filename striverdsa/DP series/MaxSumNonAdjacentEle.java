import java.util.*;

public class MaxSumNonAdjacentEle {
    public static void main(String[] args) {
        // Given a array of integer - find the sub sequenece with maximum sum - We cannot take adjacent element
        int[] arr = {2, 1, 4, 9};
        int n = arr.length -1;
        // int ans =0;
        int[] DP = new int[n+1];
        Arrays.fill(DP, -1);
        // System.out.println(MySolution(arr, n, n, ans));
        // System.out.println(MySolutionMem(arr, ans, n, DP));
        // System.out.println(MySolutionTabulation(arr, n, DP));
        System.out.println(MySolutionTabulationSpaceOp(arr, n));
    }

    public static int MySolutionTabulationSpaceOp(int[] arr, int n) {
        int first =arr[0]; // i - 1
        int second =0; // i - 2

        for(int i=1; i<=n; i++) {
            int take = arr[i] + ((i>1) ? second : 0);  
            int nottake = 0 + first;
            int curr = Math.max(take , nottake);
            second = first;
            first = curr;
            // System.out.println(first+" kk");
        }

        return first;
    }

    public static int MySolutionTabulation(int[] arr, int n, int[] DP) {
        DP[0] = arr[0];
        int pick =0;
        int notpick =0;

        for(int i=1; i<=n; i++) {
            pick = arr[i] + ((i>1) ? DP[i-2] : 0);    // DP[-1]. See how it's done
            notpick = 0 + DP[i-1];

            DP[i] = Math.max(notpick, pick);
            // System.out.println(DP[i]);
        }

        return DP[n];
    }

    public static int MySolutionMem(int[] arr, int n , int position, int[] DP) {
        int pick =0;
        int notpick =0;
        if(position == 0) {
            return arr[position];
        }
        if(position == -1) {
            return 0;
        }
        if(DP[position] != -1) {
            return DP[position];
        }
        pick += arr[position] + MySolutionMem(arr, n, position - 2, DP);
        notpick += 0 + MySolutionMem(arr, n, position - 1, DP);

        return DP[position] = Math.max(pick, notpick);
    }

    // recursion
    public static int MySolution(int[] arr, int n , int position, int ans) {
        int pick =0;
        int notpick =0;
        if(position == 0) {
            return arr[position];
        }
        if(position == -1) {
            return 0;
        }
        pick += arr[position] + MySolution(arr, n, position - 2, ans);
        notpick += 0 + MySolution(arr, n, position - 1, ans);

        ans = Math.max(pick, notpick);
        return ans;
    }
}
