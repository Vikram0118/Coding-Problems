import java.util.Arrays;

public class ArraysTut {

    // printing accordingly is an impporttant thing in array problems

    int count =0;
    public static void main(String[] args) {
        // starting array
        // int[] a = new int[5];
        ArraysTut o = new ArraysTut();

        //---------------binary search--------------
        // int position = o.binarySearch(a, 23);
        // if(position == -1){
        //     System.out.println("SEARCH UNSUCCESSFULL");
        // } else {
        //     System.out.println("SEARCH SUCCESSFULL AND THE ELEMENT IS PRESENT AT POSITION "+position);
        // }

        //-------------------- bubble sort-----------------------------------
        //----------------------- insertion sort-----------------------------------
        //----------------------- selecion sort-----------------------------------
        //----------------------- quick sort-----------------------------------
        //----------------------- merge sort-----------------------------------

        // ----------------largest constinuous sum subarray---------------------------
        // int[] a = {-3, -4, 4, -1, -2, 1, 5, -3}; 
        // o.largestConSumSubArrayNegative(a);

        //-----------------find missing number from 1 to n---------------
        // int[] a= {2, 4, 1, 3, 6, 7, 8};
        // o.missingNumberFromOneToN(a);

        // -----------DUTCH NATIONAL FLAG PROBLEM - SORT AN ARRAY OF 0's 1's 2's---------------------
        // one simple method of solving this problem is just counting the number of zeros ones and twos in the guven array by iterating and then 
        //  by iterating again we will just replace the values with zeroes ines and twos
        // int[] a = {0, 1, 1, 0, 2, 2, 1, 0, 2};
        // now here we are actually doing it in linear time only one iteration
        // o.dutchNationalFlag(a, a.length);
        // o.printArray(a);

        //---------------equilibrium point----------------
        int[] a = {1, 6, 7, 0,7};
        o.equilibriumPoint(a);
    
    }

    public void equilibriumPoint(int[] a){
        int sum =0;
        int currentSum =0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }
        for(int i=0; i<a.length; i++){
            sum -= a[i];
            if(sum == currentSum){
                System.out.println("THE EQUILIBRIUM POINT IS : "+ (i+1)+" AND THE VALUE AT THAT POINT IS : "+a[i]);
                return;
            }
            currentSum += a[i];
        }
    } 

    public void dutchNationalFlag(int[] a, int length){
        int low=0,mid=0,high=length-1;

        while(mid < high){
            if(a[mid] == 0 ){ // whenever my a[mid] = 0 i will swap it with the low when ow is now equal to 0 because, when low is equal to zero and i swap it then there is no use for the swap at all
                if(a[low] != 0){
                    a[mid] = a[low];
                    a[low] = 0;
                }
                low++;
                mid ++;
            } else if(a[mid] == 2 ){  // what i have done for the a[mid] = 0 same thing i m doing here also 
                if(a[high] != 2){
                    a[mid] = a[high];
                    a[high] = 2;
                }
                high--;
            } else if(a[mid] == 1){
                mid++;
            }
        }

    }

    public void missingNumberFromOneToN(int[] a) {
        int n = a.length+1;
        int sum =0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        int actual = (n*(n+1))/2;
        System.out.println("MISSING NUMBER IS = "+(actual-sum));
    }

    public void largestConSumSubArrayNegative(int[] a) {
        // if there are no negative element then we can use kadane's alogorithm
        // to handle both negative and positive value we use this algorithm   // it is actually "GOOD"
        int ans = Integer.MIN_VALUE;
        int current=0;
        int start =0, end =0, s=0;

        // for(int i=0; i<a.length; i++){
        //     current = Math.max(current+a[i], a[i]);
        //     ans = Math.max(ans, current);
        // }
        for(int i=0; i<a.length; i++){   // for the start and end index
            if(a[i] > current+a[i]){
                current = a[i];
                start = i;
            } else {
                current = current + a[i];
            }
            if(current > ans) {
                ans = current;
                end =i;
            }
        }
        System.out.println("THE SUBARRAY IS FROM "+(start+1)+" TO "+(end+1));
        System.out.println("THE LONGEST POSSIBLE SUM : "+ans);
    }

    public void printArray(int a[]){
        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+" "); 
        }
    }

    public void insertAtEnd(int[] a, int val) {
        a[count++] = val;
    }

    public void insertAtStart(int[] a, int val) {
        // for(int i=a.length-1; i>=0; i--){
        //     if(i==0){       // why did i check every time :(.....it is know i m going to insert at index 0 so this is unwanted
        //         a[i] =val;
        //         return;
        //     }
        //     a[i] = a[i-1];
        // }
        for(int i=a.length-1; i>0; i--){  // better
            a[i] = a[i-1];
        }
        a[0] = val;
    }

    public void insertAtPosition(int[] a, int val, int position) {
        if(position > a.length){
            System.out.println("SPECIFIED POSITION DOESN'T EXISTS");
            return;
        } else {
            for(int i=a.length-1; i>=0; i--){
                if(i==(position)){    // what i did for insert at start....i can do that here as well
                    a[i] =val;
                    return;
                }
                a[i] = a[i-1];
            }
        }
    }

    public void deleteAtValue(int[] a , int val) {
        int i ;
        for( i=0; i<a.length; i++){
            if(a[i] == val){
                break;
            }
        }
        if(i==a.length){
            System.out.println("VALUE DOESN'T EXIST IN ARRAY");
            return;
        }
        for(int j =i; j<a.length-1 ; j++){
            a[j] = a[j+1];
        }
    }

    public void deleteAtPosition(int a[], int position) {
        if(position>a.length || position<=0){
            System.out.println("INVALID POSITION");
            return;
        }
        for(int i=position-1; i<a.length -1;i++){
            a[i] = a[i+1];
        }
    }

    public int binarySearch(int[] a, int val) {
        int l = a.length;
        int s=0; 
        int mid;

        while(s<l){
            mid = (s+l) / 2;
            System.out.println(mid);
            if(a[mid] == val) {
                return mid + 1;
            } else if(val > a[mid]){
                s=mid+1;
            } else {
                l=mid;
            }
        }
        return -1;
    }

}
