public class seven {
    public static void main(String[] args) {
        // find 1st occurance of a value - if adjacent element differ by 1

        // int[] arr = {7, 6, 7, 6, 5, 4};
        int[] arr = {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
        int key = 2;

        // simple brute force 
        // for(int i =0; i<arr.length-1; i++) {
        //     if(arr[i] == key) {
        //         System.out.println("The first occurance of "+key+" is "+i);
        //         return;
        //     }
        // }

        // Optimizied
        int i=0;
        while(i<arr.length) {
            if(arr[i] == key) {
                System.out.println("The first occurance of "+key+" is position "+(i+1));
                return;
            } else {
                int ref = Math.abs(arr[i] - key);
                i += ref; 
            }
        }
    }
    
}
