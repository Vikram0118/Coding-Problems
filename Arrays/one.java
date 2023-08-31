public class one {
    public static void main(String[] args) {
        
        // Get the largest contiguous sum of sub-array
        int[] arr = {-3, -4, 4, -1, -2, 1, 5, -3};

        // System.out.println("The Largest possible sum = "+SingleLoop(arr));
        System.out.println(TwoLoops(arr));
    }

    public static int ThreeLoops(int[] arr){
        int sum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int temp =0;
                for(int k= i; k<=j; k++){
                    temp += arr[k];
                    // System.out.print(arr[k]+" ");
                }
                if(temp > sum){
                    sum = temp;
                }
                // System.out.println();
            }
        }

        return sum;
    }

    public static int TwoLoops(int[] arr) {
        int sum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            int temp = 0;
            for(int j=i; j<arr.length; j++) {    
                temp += arr[j];
                if(temp > sum) {    // why its inside for loop of j ?? -> purinjiduchii
                    // System.out.println(temp);
                    sum = temp;
                }
            }
        }
        return sum;
    }

    public static int SingleLoop(int[] arr) {
        int sum = Integer.MIN_VALUE, temp =0;

        for(int i=0; i<arr.length; i++) {
            temp = Math.max(temp+arr[i], arr[i]);
            sum = Math.max(sum, temp);
        }

        return sum;
    }

    public static int SingleLoopWithIndex(int[] arr) {
        int sum = Integer.MIN_VALUE, temp=0, start =0, end =0;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > temp+arr[i]) {
                temp = arr[i];
                start = i;
            } else {
                temp = temp + arr[i];
            }

            if(temp > sum) {
                sum = temp;
                end = i;
            } 
        }
        for(int i=start; i<=end; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return sum;
    }

    public static int KadaneAlgo(int[] arr) {
        // if there are no negative values then we can use this algorithm
        int sum = Integer.MIN_VALUE, temp=0;

        for(int i=0; i<arr.length; i++) {
            temp = Math.max(temp+arr[i], arr[i]);
            sum = Math.max(temp, sum);
        }
        return sum;
    }

}
