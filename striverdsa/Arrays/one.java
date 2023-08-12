import java.util.Arrays;

class one {
    public static void main(String[] args) {
        // int[] arr = {-1, -2, 2, 1, 5, 2};
        // System.out.println("the largest element : "+LargestInteger(arr));
        // System.out.println("Second largest : "+SecondLargestElement(arr));
        // System.out.println("Second smallest : "+SecondSmallestElemnt(arr));

        int[] array = {1, 2, 3};
        array = RemoveDuplicatesInSortedArray(array);
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static int LargestInteger(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static int SecondLargestElement(int[] arr) {   // important question
        // we have to do it without sorting 
        int max = arr[0], result = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                result = max;
                max = arr[i];
            } else if(arr[i] > result && arr[i] < max) {
                result = arr[i];
            }
        }
        return result;
    }

    public static int SecondSmallestElemnt(int[] arr) {
        int min = Integer.MAX_VALUE, result = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                result = min;
                min = arr[i];
            } else if(arr[i] < result && arr[i] > min) {
                result = arr[i];
            }
        }

        return result;
    }

    public static int[] RemoveDuplicatesInSortedArray(int[] arr) {

        // remove duplicate element from array in place 
        // 1 2 3 1 2 3 3 

        int i = 0, j = 0;
        while(j < arr.length) {
            if(arr[i] == arr[j]) {
                j++;
            } else {
                int temp = arr[j];
                arr[j] = arr[i+1];
                arr[i+1] = temp;
                i++;
                j++;
            }
        }
        System.out.println("Number of Unique elements : "+(i+1));
        return Arrays.copyOfRange(arr, 0, i+1);
    }
}