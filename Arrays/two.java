public class two {
    public static void main(String[] args) {
        // Equilibrium point in an Array

        int[] arr = { 1, 6, 7, 0, 7};
        // int[] arr = { 5, 5, -10, 6, 0};

        int sum=0, ref=0;

        for(int i=0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 0  20
        // 1  14
        // 7  7

        for(int i=0; i < arr.length; i++) {
            sum -= arr[i];
            if(ref == sum) {
                System.out.println("The Equilibrium point is "+arr[i]+" at position "+(i+1));
                return;
            }
            ref += arr[i];
        }
        
    }
}
