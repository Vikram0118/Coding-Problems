import java.util.Arrays;

public class SubArrays {
    public static void main(String[] args) {

        //--------subarray those sum is equal to the given sum--------------
        // int[] a = {4, 2, 5, 3, 1, 9};
        // int key = 10;
        // int i=0, j=0, temp=0;

        // while(i<=j){
        //     temp += a[j];
        //     j++;
        //     if(temp == key){
        //         System.out.println(a[i]+" + "+a[j]+" = "+temp);
        //         return;
        //     }
        //     if(temp > key){
        //         temp -= a[i];    // important place to keep track of the current subarray
        //         i++;
        //     }
        // }

        //----------------maximum sum of subarray with size k----------------------
        // int[] a = {3, 2, 5, 4, 1};
        // int k = 2;
        // int i=0, j=0, temp=0, max=Integer.MIN_VALUE;

        // while(i<=j && j< a.length){
        //     if((j-i) == k) {  // i was writing it as if((j-i) == k-1) // important to understand the k value because j value just increses not addaed 
        //         if(max < temp) {
        //             max = temp;
        //         }
        //         temp -= a[i];
        //         i++;
        //     }
        //     temp += a[j];
        //     j++;
        // }
        // System.out.println("THE MAXIMUM SUM OF THE SUBARRAY WITH SIZE "+k+" IS : "+max);

        //--------------smallest subarray length with the given sum-------------------
        // int[] a = {3, 2, 5, 5, 3, 2, 10};
        // int key =10;
        // Arrays.sort(a);
        // int i =0, j=0, temp=a[0], length =Integer.MAX_VALUE;

        // while(i<=j && j<a.length){
        //     if(temp == key){
        //         if((j-i) < length){
        //             // System.out.println(i+" - "+j);
        //             length = (j-i);
        //         }
        //     }
        //     if(temp > key) {
        //         temp -= a[i];
        //         i++;
        //         continue;
        //     } else {
        //         j++;
        //         if(j == a.length) {
        //             break;
        //         } else {
        //             temp += a[j];
        //         }
        //     } 
        // }
        // System.out.println("THE MINIMUM LENGTH OF THE SUBARRAY WHOSE SUM IS EQUAL TO : "+key+" IS : "+(length+1));

        //---------------------sub array with max sum----------KADANE'S ALGORITHM--------#####################----------

        // kadanes alogorithm gives only the maximum possible positive sum
        // int[] a= {-3, 2, -7, 6, -2, 4, -8, 5};

        // int sum =0 , ans = Integer.MIN_VALUE;

        // for(int i=0; i<a.length; i++) {
        //     sum = sum + a[i];
        //     if(sum < 0){
        //         sum = 0;
        //         continue;
        //     }
        //     if(sum > ans){
        //         ans = sum;
        //     }
        // }
        // System.out.println("THE LONGEST POSSIBLE SUM : "+ans);

        // if there are no negative element then we can use kadane's alogorithm
        // to handle both negative and positive value we use this algorithm   // it is actually "GOOD"
        //  int[] a = {-3, -4, 4, -1, -2, -1, -5, -3}; 
        //  int ans = Integer.MIN_VALUE;
        //  int current=0;
        //  int start =0, end =0;

        //  for(int i=0; i<a.length; i++){
        //      current = Math.max(current+a[i], a[i]);
        //      ans = Math.max(ans, current);
        //  }
         // for(int i=0; i<a.length; i++){   // for the start and end index
         //     if(a[i] > current+a[i]){
         //         current = a[i];
         //         start = i;
         //     } else {
         //         current = current + a[i];
         //     }
         //     if(current > ans) {
         //         ans = current;
         //         end =i;
         //     }
         // }
        //  System.out.println("THE SUBARRAY IS FROM "+(start+1)+" TO "+(end+1));
        //  System.out.println("THE LONGEST POSSIBLE SUM : "+ans);

        //--------------get maxinum of all subrray of size k -----------------------
        // int[] a = {2, 5, 4, 3, 1, 7};
        // int k=3;
        // int max =Integer.MIN_VALUE, i=0, j=0;

        // while(i<=j && j<a.length){

        //     if(a[j] > max){
        //         max = a[j];   // max va,ue updte panna thrl - dequeq lam use pannaranga 
        //     }

        //     if((j-i) == k-1){
        //         System.out.println(max);
        //         i++;
        //     }
        //     j++;
        // }

        //----------------

        
        

    }
}