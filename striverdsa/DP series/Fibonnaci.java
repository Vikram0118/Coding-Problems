import java.util.Arrays;

class Fibonnaci {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21
        int n = 5;
        int[] DP = new int[n+1];
        Arrays.fill(DP, -1);
        // System.out.println(fibonacciSeriesDPMem(n, DP));
        // System.out.println(fibonacciSeriesDPTab(n, DP));
        System.out.println(fibonacciSeriesDPTabSO(n));

    }

    public static int fibonacciSeriesDPTabSO(int n) {
        // tabulation
        // time - O(n)
        // space - O(1)
        int prev2 = 0;
        int prev =1;
        int result =0;

        for(int i = 2; i<=n; i++) {
            result = prev + prev2;
            prev2 = prev;
            prev = result;
        }

        return prev;
    }

    public static int fibonacciSeriesDPTab(int n, int[] DP) {
        // tabulation
        // time - O(n)
        // space - O(n)
        DP[0] = 0;
        DP[1] = 1;

        for(int i = 2; i<DP.length; i++) {
            DP[i] = DP[i-1] + DP[i-2];
        }

        return DP[n];
    }

    public static int fibonacciSeriesDPMem(int n, int[] DP) {
        // memoizzation
        // time - O(n)
        // space - O(n) + recursion stace space
        if(n <= 1) {
            return n;
        }
        if(DP[n] != -1) {
            return DP[n];
        }
        return DP[n] = fibonacciSeriesDPMem(n-1, DP) + fibonacciSeriesDPMem(n-2, DP);
    }

    public static int fibonacciSeries (int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciSeries(n-1) + fibonacciSeries(n-2);
    }
}