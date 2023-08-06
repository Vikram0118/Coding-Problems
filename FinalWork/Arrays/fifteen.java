public class fifteen {
    public static void main(String[] args) {
        // video number 40

        // find the subarray length such that if we sort then the whole array will be sorted

        int[] arr = {1, 2, 5, 3, 19, 12, 8, 15, 18};  // test case
        // {1,2,5,3,0,12,13,8,15,18}  // test case
        // int[] arr = {1, 2, 5, 3, 6, 10, 9, 21, 25};

        // from start
        // int start = -1, end = -1, curr_max = Integer.MIN_VALUE;
        // for(int i =0; i<arr.length; i++) {
        //     curr_max = Math.max(curr_max, arr[i]);
        //     if( start < 0 && arr[i] < curr_max ) {
        //         start = i-1;
        //     }
        //     if( arr[i] < curr_max ) {
        //         end = i;
        //     }
        // }

        // two pointer
        int start = 0, end = arr.length -1;

        while(true) {
            if(arr[start] < arr[start +1]){
                start ++;
            } else {
                break;
            }
        }
        while(true) {
            if(arr[end] > arr[end -1]){
                end --;
            } else {
                break;
            }
        }

        int front = (start == 0) ? 0  : start -1;
        int back = (end == arr.length -1) ? arr.length -1  : end +1;
        int min = Integer.MAX_VALUE,  max = Integer.MIN_VALUE;

        for(int i=start; i<=end; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        while(front>=0) {
            if(arr[front] > min) {
                start = front;
            }
            front--;
        }

        while(back < arr.length) {
            if(arr[back] < max) {
                end = back;
            }
            back++;
        }
        

        for(int i=start; i<=end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The smallest subarray length that need to be sorted : "+(end - start +1));
        System.out.println("Starting from the position "+(start +1)+" till the position "+(end + 1));
    }
}
