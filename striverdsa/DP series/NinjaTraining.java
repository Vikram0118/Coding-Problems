

public class NinjaTraining {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 50, 1},
            {5, 100, 11}
        };
        int n = arr.length - 1;
        int[][] DP = new int[n+1][n+1];
        for(int i=0; i<DP.length; i++) {
            for(int j=0; j<DP[0].length; j++) {
                DP[i][j] = -1;
            }
        }
        System.out.println(MySolution(arr, n, 0, 2));
        System.out.println(MySolutionMem(arr, n, 0, 2, DP));
    }

    //memoization
    public static int MySolutionMem(int[][] arr, int n, int points, int last,int[][] DP) {
        if(n == 0) {
            int max1 = Integer.MIN_VALUE;
            for(int i=0; i<arr[0].length ; i++) {
                if(i != last) {
                    if(DP[n][i] != -1) {
                        return DP[n][i];
                    }
                    max1 = Math.max(max1, points + arr[n][i]);
                }
            } 
            return max1;
        }

        int ans = Integer.MIN_VALUE;
        for(int i=0 ; i<arr[n].length; i++) {
            int curr = arr[n][i] ;
            if(i != last) {
                if(DP[n][i] != -1) {
                    return DP[n][i];
                }
                curr =  MySolution(arr, n-1, curr, i);
            } 
            ans = Math.max(ans, curr);
        }

        return ans;
    }

    // recursion
    public static int MySolution(int[][] arr, int n, int points, int last) {
        if(n == 0) {
            int max1 = Integer.MIN_VALUE;
            for(int i=0; i<arr[0].length ; i++) {
                if(i != last) {
                    max1 = Math.max(max1, points + arr[n][i]);
                }
            } 
            return max1;
        }

        int ans = Integer.MIN_VALUE;
        for(int i=0 ; i<arr[n].length; i++) {
            int curr = arr[n][i] ;
            if(i != last) {
                curr =  MySolution(arr, n-1, curr, i);
            } 
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}
