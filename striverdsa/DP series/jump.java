

public class jump {
    public static void main(String[] args) {
        // int[] arr = {2, 5, 0, 0};
        // int[] arr = {2, 3, 1, 1, 4};
        int[] arr = {3, 2, 1, 0, 4};
        int n = arr.length- 1;
        int[] DP = new int[n+1];
        for(int i=0; i<DP.length; i++) {
            DP[i] = -1;
        }
        System.out.println(MySolution(arr, 0, n, DP));
    }

    public static boolean MySolution(int[] arr, int index, int n, int[] DP) {
        if(index == n){
            return true;
        }
        boolean ans = false;
        if(DP[index] != -1) {
            return DP[index] == 1;
        }
        for(int i =1; i<=arr[index]; i++) {
            ans = MySolution(arr, index + i, n, DP);
            if(ans == true) {
                DP[index] = 1;
                return ans;
            }
        }
        DP[index] = 0;
        return ans;
    }
}
