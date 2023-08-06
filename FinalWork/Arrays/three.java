public class three extends Utils {
    public static void main(String[] args) {

        // Sort an array of 0's, 1's and 2's
        // Dutch National Flag Problem

        int[] arr = {0, 1, 1, 0, 2, 2, 1, 0, 2};

        int start = 0 , end = arr.length-1 , mid = 0;

        while( mid < end ) {
            switch(arr[mid]) {
                case 0 :
                    // if(arr[start] > arr[mid])
                    if(arr[start] > arr[mid])
                        swap(arr, start, mid);
                    start ++;
                    mid++;
                    break;
                case 1 :
                    mid ++;
                    break;
                case 2 :    
                    if(arr[end] != arr[mid])
                        swap(arr, end, mid);
                    // else
                        // end--;
                    end--;      // improved version
                    break;
            }
        }
        print(arr);
    }
}
