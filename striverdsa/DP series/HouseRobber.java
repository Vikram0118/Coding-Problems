public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2};
        int n = arr.length -1;
        System.out.println("maximum robbered money : ");
        System.out.println(Math.max(MySolutionTabulationSpaceOp(arr, 0, n-1), MySolutionTabulationSpaceOp(arr, 1, n)));
    }

    public static int MySolutionTabulationSpaceOp(int[] arr, int start, int end) {
        int first =arr[start]; // i - 1
        int second =0; // i - 2

        for(int i=start +1; i<=end; i++) {
            int take = arr[i] + ((i>1) ? second : 0);
            int nottake = 0 + first;
            int curr = Math.max(take , nottake);
            second = first;
            first = curr;
            // System.out.println(first+" kk");
        }

        return first;
    }

}
