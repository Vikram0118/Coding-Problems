import java.util.*;

public class FrogJump {
    public static void main(String[] args) {
        // int[] energy = {10, 20, 30, 10};
        int[] energy = {30, 10, 60, 10, 60, 50};
        int n = energy.length -1;
        int[] DP = new int[n+1];
        Arrays.fill(DP, -1);
        System.out.println(MySolution(energy, n, n));
        System.out.println(MySolutionUsingDPMem(energy, n, n, DP));
        System.out.println(MySolutionUsingDPTabulation(energy, n));
    }

    // tabulation 
    public static int MySolutionUsingDPTabulation(int[] energy, int total) {
        int[] DP = new int[total +1];
        Arrays.fill(DP, -1);
        DP[0] = 0;

        for(int i=1; i<=total; i++) {
            int firstStep  = DP[i-1] +  Math.abs((energy[i] - energy[i-1]));
            int secondStep = Integer.MAX_VALUE;
            if(i > 1) {
                secondStep = DP[i-2] + Math.abs((energy[i] - energy[i-2]));
            }
            DP[i] = Math.min(firstStep, secondStep);
        }
        return DP[total];
    }

    // converting that recusrion to DP memoisation
    public static int MySolutionUsingDPMem(int[] energy, int position, int total, int[] DP) {
        int left, right = Integer.MAX_VALUE;
        if(position == 0) {
            return 0;
        }
        if(DP[position] != -1) {
            return DP[position];
        }
        left = MySolutionUsingDPMem(energy, position -1, total, DP) + Math.abs((energy[position] - energy[position-1]));
        if(position > 1) {
            right = MySolutionUsingDPMem(energy, position -2, total, DP) + Math.abs((energy[position] - energy[position-2]));
        }
        DP[position] = Math.min(left, right);
        return DP[position];
    }

    // recursion
    public static int MySolution(int[] energy, int position, int total) {
        int left, right = Integer.MAX_VALUE;
        if(position == 0) {
            return 0;
        }
        left = MySolution(energy, position -1, total) + Math.abs((energy[position] - energy[position-1]));
        if(position > 1) {
            right = MySolution(energy, position -2, total) + Math.abs((energy[position] - energy[position-2]));
        }

        return Math.min(left, right);
    }
}

