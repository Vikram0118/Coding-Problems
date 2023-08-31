import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;

        System.out.println(MySolution(0, n));
        // System.out.println(MySolutionUsingDP(n, n, 0));
        int[] DP = new int[n+1];
        Arrays.fill(DP, -1);
        // System.out.println(MySolutionUsingDPMem(n, n, DP));
    }

    public static int MySolutionUsingDPMem(int position, int n,int[] DP) {

        if(position == 0) {
            return 1;
        }
        if(position == 1) {
            return 1;
        }
        if(DP[position] != -1) {
            return DP[position];
        }
        return DP[position] = MySolutionUsingDPMem(position -1, n, DP) + MySolutionUsingDPMem(position -2, n, DP);
    }

    // using recursion - using fibonacci logic -- top bottom approach
    public static int MySolutionUsingDP(int position, int n, int ans) {

        if(position == 0) {
            return 1;
        }

        if(position >= 2) {
            ans = MySolutionUsingDP(position -1, n, ans) + MySolutionUsingDP(position -2, n, ans);
        } else {
            ans = MySolutionUsingDP(position - 1, n, ans);
        }

        return ans;
    }

    // using recursion - using subseq problem logic  -- bottom up approach
    public static int MySolution(int position , int n ) {
        int result =0;

        if(position == n) {
            return 1;
        }

        if(position <= n - 2) {
            result += MySolution(position + 1, n);
            result += MySolution(position + 2, n);
        } else {
            result += MySolution(position + 1, n);
        }
        return result;
    }
}
