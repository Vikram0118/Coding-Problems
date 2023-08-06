public class five {
    public static void main(String[] args) {
        // print element which are greater than or equal all its right element 

        int[] arr = {14, 15, 8, 9, 5, 2};

        // int ref1=0, ref2, ref3=Integer.MIN_VALUE, i=arr.length -1;
        // int ref2 = Integer.MAX_VALUE, ref1=Integer.MIN_VALUE, i=arr.length -1;

        // while(i>=0) {
        //     // ref2 = Math.max(arr[i], ref3);
        //     ref2 = Math.max(arr[i], ref1);
        //     if(ref2 != ref1) {
        //         System.out.print(ref2+" ");
        //         ref1 = ref2;
        //     }
        //     i--;
        //     // ref3 = arr[i+1];
        // }

        // ------------------------------------------------------------------------

        int max = Integer.MIN_VALUE;
        for(int j =arr.length -1 ; j>=0; j--) {
            if(arr[j] > max) {
                max = arr[j];
                System.out.print(arr[j]+" ");
            }
        }
    }
}
