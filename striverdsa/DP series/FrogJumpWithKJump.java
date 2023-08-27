import java.util.Arrays;

class FrogJumpWithKJump {
     public static void main(String[] args) {
        // int[] energy = {10, 20, 30, 10};
        int[] energy = {30, 10, 60, 10, 60, 50};
        int k = 2;
        int n = energy.length -1;
        int[] DP = new int[n+1];
        Arrays.fill(DP, -1);
        System.out.println(MySolution(energy, n, n, k));
        System.out.println(MySolutionUsingDPMem(energy, n, n, DP, k));
        System.out.println(MySolutionUsingDPTabulation(energy, n, k));
    }

    // tabulation 
    public static int MySolutionUsingDPTabulation(int[] energy, int total, int k) {
        int[] DP = new int[total +1];
        Arrays.fill(DP, -1);
        DP[0] = 0;

        for(int i=1; i<=total; i++) {
            int ans = Integer.MAX_VALUE;
            int CurrJump =0;
            for(int j = 1; j<=k; j++) {
                if(i >= j) {
                    CurrJump = DP[i-j] + Math.abs((energy[i] - energy[i-j]));
                }
                ans = Math.min(ans , CurrJump);
            }
            DP[i] = ans;
        }
        return DP[total];
    }

    // converting that recusrion to DP memoisation
    public static int MySolutionUsingDPMem(int[] energy, int position, int total, int[] DP, int k) {
        int ans = Integer.MAX_VALUE;
        int CurrJump =0;
        if(position == 0) {
            return 0;
        }
        if(DP[position] != -1) {
            return DP[position];
        }
        for(int i = 1; i<=k; i++) {
            if(position >= i) {
                CurrJump = MySolution(energy, position - i, total, k) + Math.abs((energy[position] - energy[position-i]));
            }
            ans = Math.min(ans, CurrJump);
        }
        DP[position] = ans;
        return DP[position];
    }

    // recursion
    public static int MySolution(int[] energy, int position, int total, int k) {
        // int left, right = Integer.MAX_VALUE;
        if(position == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int CurrJump =0;
        for(int i = 1; i<=k; i++) {
            if(position >= i) {
                CurrJump = MySolution(energy, position - i, total, k) + Math.abs((energy[position] - energy[position-i]));
            }
            ans = Math.min(ans, CurrJump);
        }

        return ans;
    }
}