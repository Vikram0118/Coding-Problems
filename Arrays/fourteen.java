public class fourteen {
    public static void main(String[] args) {
        // // Longest subarray length with all 1's
        // int[] arr= {0, 1, 0, 1, 0, 1, 1, 1, 0};

        // int max =0, curr=0;

        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] == 1) {
        //         curr += 1;
        //         max = Math.max(max, curr);
        //     } else {
        //         curr =0;
        //     }
        // }

        // System.out.println(max);

        // just the same as the above one 
        // int max =0, curr_max =0;

        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] == 1 ){
        //         curr_max += 1;
        //     } else{
        //         max = Math.max(max, curr_max);
        //         curr_max=0;
        //     }
        // }
        // System.out.println("The maximum subarray length with 1's : "+max);

        
        // --------------------------------------------------------------------------------------------------------------------------

        // Longest subarray length with all 1s it at maximum k 0s can be replaced with 1s

        int[] arr= {0, 1, 0, 1, 0, 1, 1, 1, 0};
        // int[] arr= {0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0};
        int no_fo_zero =0, k=2, start=0, end=0, max=0, i=0, j=0;

        while(end < arr.length) {
            j = end;
            i = start;
            if(arr[end] == 0){
                no_fo_zero += 1;
                System.out.println(no_fo_zero);
            }

            while(no_fo_zero > k) {
                if(arr[start] == 0){
                    no_fo_zero -= 1;
                }
                start ++;
            }

            max = Math.max(end - start + 1, max);
            end++;
        }

        System.out.println(start+" - "+end);
        System.out.println("start "+i+" -- end "+j);
        System.out.println("The maximum subarray length with 1's : "+max);
        
    }
}
