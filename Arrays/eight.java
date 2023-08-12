public class eight {
    public static void main(String[] args) {
        // find 1st occurance of a value - if adjacent element differ by AT MOST k

        // int[] arr = {7, 6, 7, 6, 5, 4};
        int[] arr = {70, 60, 70, 80, 90, 110, 130};
        int key = 60, k= 20;

        // Optimizied
        int i=0;
        while(i<arr.length) {
            if(arr[i] == key) {
                System.out.println("The first occurance of "+key+" is position "+(i+1));
                return;
            } else {
                int ref = Math.abs(arr[i] - key) / k;
                // ref = ref/k;     // important
                ref = Math.max(1, ref);
                i += ref; 
            }
        }
    }
}
