import java.util.Arrays;

public class threeteen {
    public static void main(String[] args) {
        // find the maximum multiplication of any two numbers in an array

        int[] arr= {4, 1, 2, 7, 3};

        // brute force

        // sorting // for positive numbers only - this can be easily fixed(done)
        Arrays.sort(arr);
        // System.out.println("The maximum multiplication of two numbers in the array is : "+(arr[arr.length-1] * arr[arr.length-2]));
        System.out.println("The maximum multiplication of two numbers in the array is : "+Math.max( (arr[arr.length-1] * arr[arr.length-2]) , arr[0] * arr[1] )); // fixed

        // improving

        int fl=Integer.MIN_VALUE, sl=Integer.MIN_VALUE, fs=Integer.MAX_VALUE, ss=Integer.MAX_VALUE; // first largest value , second largest value, first smallest value , second smallest value 

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > fl) {
                fl = arr[i];
            }

            if(arr[i] < fs) {
                fs = arr[i];
            }
        }

        System.err.println("fs - "+fs+" ss - "+ss+" fl - "+fl +" sl - "+sl);
    }
}
