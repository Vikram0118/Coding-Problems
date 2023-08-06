import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysTut {

    // printing accordingly is an impporttant thing in array problems
    // while using hash set -- don't waste a for loop in filling the hash set, we can just add to the hash set along the way

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
        o.dutchNationalFlag(a, a.length);
        // o.printArray(a);

        //---------------equilibrium point----------------
        int[] a = {1, 6, 7, 0,7};
        o.equilibriumPoint(a);

        //-----------------print element greater than are equal to its right side---------------
        // int[] a = {14, 15, 8, 9, 5, 2};
        // o.printElementsGreaterRight(a);

        //---------------check if a pair exists for given sum-----------------
        // int[] a= {12, 3, 5, 9};
        // // System.out.println(o.ifPairExists(a, 10)); // stored and binary search
        // // we can do that using hashing
        // Set<Integer> s = new HashSet<>();
        // for(int i =0; i<a.length; i++){
        //     if(s.contains(10-a[i])){
        //         System.out.println("true");
        //         return;
        //     } else {
        //         s.add(a[i]);
        //     }
        // }
        // System.out.println("false");

        //----------------search for the element's 1st occurance when the element differs by one element to the adjacent eleement------
        // we can use brute force approach 
        // the idea used here is that i will subract the target element to the current hiolding eleemnt and based on that nimber i willjump  
        // int[] a= {2, 3, 2, 3, 4, 5, 6, 7};
        // boolean flag = true;
        // int value = 2; 
        // int i=0;
        // while(flag) {
        //     i += Math.abs( ( a[i] - value ) );
        //     if(a[i] == value){
        //         System.out.println("THE FIRST OCCURANCE OF "+value+" IS : "+(i+1)+"th POSITION");
        //         flag = false;
        //     }
        // }

        //----------------search for the element's 1st occurance when the element differs by K element to the adjacent eleement------
        // we can use brute force approach 
        // the idea used here is that i will subract the target element to the current hiolding eleemnt and based on that nimber i willjump  
        // int[] a= {70, 60, 70, 80, 100, 110, 130};
        // boolean flag = true;
        // int k =20;
        // int value =  110; 
        // int i=0;
        // while(flag) {
        //     i += (int)Math.ceil((float)Math.abs( a[i] - value ) /20);
        //     // System.out.println((float) Math.abs( a[i] - value ) / 20);
        //     if(a[i] == value){
        //         System.out.println("THE FIRST OCCURANCE OF "+value+" IS : "+(i+1)+"th POSITION");
        //         flag = false;
        //     }
        // }

        // -------------------first repeating elements of an array-------------
        // int[] a = {2 , 2, 3, 4, 4, 3, 5, 7};
        // int k = o.firstReapeatingElement(a);
        // System.out.println("THE FIRST REPEATING VALUE IS : "+k);

        //-----------union of two sorted arrays-----------------
        // int[] a = {2, 3, 4, 7, 8};
        // int[] b = {1, 2, 4, 6, 7, 8, 10};
        // List<Integer> s = new ArrayList<>();
        // boolean flag = true;
        // int i=0;

        // while(flag){
        //     flag = false;
        //     if(i<a.length){
        //         s.add(a[i]);
        //         flag = true;
        //     }
        //     if(i<b.length){
        //         s.add(b[i]);
        //         flag = true;
        //     }
        //     i++;
        // }
        // int[] a = {2, 3, 4, 7, 8}; // j
        // int[] b = {1, 2, 4, 6, 7}; //i
        // int[] c = new int[20];;
        // boolean flag = true;
        // int i=0, j=0, k=0;

        // while(flag){
        //     flag = false;
        //     if(j<a.length && i< b.length){
        //         if(b[i] < a[j]){
        //             c[k] = b[i];
        //             i++;
        //             k++;
        //             flag = true;
        //         } else if(a[j] < b[i]){
        //             c[k] = a[j];
        //             j++;
        //             k++;
        //             flag = true;
        //         } else {
        //             c[k] = a[j];
        //             i++;
        //             j++;
        //             k++;
        //             flag = true;
        //         }
        //     } else {
        //         System.out.println("jii");
        //         if(j<a.length || i<b.length){
        //             if (j>=a.length) {
        //                 for(int q = i; q < b.length; q++){
        //                     c[k] =b[i];
        //                     k++;
        //                 }
        //             } else {
        //                 for(int q = j; q < a.length; q++){
        //                     c[k] =a[j];
        //                     k++;
        //                 }
        //             }
        //         }
        //         flag = false;
        //     }
        // }

        // int[] c = {};
        // for(int p =0; p<s.size();p++){
        //     // c[p] = s.get(p);
        //     System.out.println(s.get(p));
        // }
        // for(int k=0; k<c.length; k++){
        //     System.out.println(c[k] +" ");
        // }

        //-----------------intersection fo two sorted arrays--------------------
        // int[] a = {2, 2, 2, 3, 3, 4, 7, 8 };   // i
        // int[] b = {1, 2, 2, 4, 4, 6, 6, 7, 8, 10};  // j
        // int[] c = new int[a.length + b.length];
        // List<Integer> s = new ArrayList<>();
        // int i=0, j=0;

        // while(i < a.length && j < b.length) {

        //     // to skip this redundant elements
        //     while(i<a.length-1 && a[i]==a[i+1]){   // these two while loops are important for test cases
        //         i++;
        //     }
        //     while(j<b.length-1 && b[j]==b[j+1]){
        //         j++;
        //     }
        //     if(a[i] == b[j]) {
        //         s.add(a[i]);
        //         i++;
        //         j++;
        //     } else if(a[i] > b[j]) {
        //         j++;
        //     } else {
        //         i++;
        //     }
        // }

        // for(int k=0; k<s.size(); k++){
        //     System.out.print(s.get(k)+" ");
        // }
        // for(int k=0; k<c.length; k++){
        //     System.out.print(c[k]+" ");
        // }

        //--------------two number in the array multiply to give the target value------------------
        // int[] a = {4, 1, 3, 10, 7, 5, 8};
        // Arrays.sort(a);
        // int i=0, j=a.length-1;
        // int key = 15;
        // int n =0;
        // // only if i have a positive numbers
        // while (i<j){
        //     n = i*j;
        //     if(n==key){
        //         System.out.println("("+i+","+j+") = "+key);
        //         return;
        //     } else if(n<key){
        //         i++;
        //     } else {
        //         j--;
        //     }
        // }

        //---------------max mul of any two number--------------
        // int[] arr = {4, 1, 3};                
        // int[] arr = {-4, 7, -1,-99, 18, 2, 5};

        // int min=0, sMin=0, max=0, sMax=0;

        // if(arr.length > 3){           // this hold good for all cases and time completixity is o(n)
        //     if(arr[0] < arr[1]){
        //         min = arr[0];
        //         sMin = arr[1];
        //         max= arr[1];
        //         sMax = arr[0];
        //     }
        //     for(int i=2; i<arr.length; i++){
        //         if(arr[i] < min){
        //             sMin = min;
        //             min = arr[i];
        //         } else if(arr[i] > min && arr[i] < sMin){
        //             sMin = arr[i];
        //         }
        //         if(arr[i] > max ){
        //             sMax = max;
        //             max = arr[i];
        //         }  else if(arr[i] > sMax && arr[i] < max){
        //             sMax = arr[i];
        //         }
        //     }
        // }
        // if(sMax*max > sMin*min){
        //     System.out.println("("+sMax+","+max+")= "+((sMax*max)));
        // } else {
        //     System.out.println("("+sMin+","+min+")= "+((sMin*min)));
        // }
        
        // for(int i=0; i<arr.length; i++){     // this doesn't hild good for this case int[] arr = {4, 1, 3};   
        //     if(arr[i] > b){
        //         a = b;
        //         b = arr[i];
        //     } 
        // }
        // int key = a*b;
        // System.out.println("("+a+","+b+")= "+key);

        // ---------segregate 0 and 1----------------
        // int[] a = {0, 1, 1, 0, 0, 0, 1, 1, 0, 1};
        // int i=0, j=0;

        // while(i<a.length) {
        //     if(a[i] == 0){
        //         a[i] = a[j];
        //         a[j] = 0;    
        //         i++;
        //         j++;
        //     } else {
        //         i++;
        //     }
        // }
        // for(int k =0; k<a.length; k++){
        //     System.out.print(a[k]+" ");
        // }

        

    }

    public int firstReapeatingElement(int[] a){
        Set<Integer> s = new HashSet<>();
        int index =0;
        for(int i=a.length -1; i>0; i--){
            if(s.contains(a[i])){
                index = a[i];
            } else {
                s.add(a[i]);
            }
        }
        return index;
    }

    public boolean ifPairExists(int[] a, int val){
        // method 1 (brute force) - take one element and i will iterate to the array and and check if the sum of any other element is equal to the value
        // method 2 - i will sort it first and i will take one element and subract it with the value and i will search for the ans in the remaning element using binary search
        ArraysTut o = new ArraysTut();
        int remain =0;
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            remain = val - a[i];
            
            if(o.binarySearchForSubArray(a, remain, i+1, a.length)){
                System.out.println("THE PAIR IS : ("+a[i]+","+remain+")");
                return true;
            }
            
        }
        return false;
    }

    public boolean binarySearchForSubArray(int[] a, int val, int start , int last) {
        int l = last;
        int s = start; 
        int mid;

        while(s<l){
            mid = (s+l) / 2;
            // System.out.println(mid);
            if(a[mid] == val) {
                return true;
            } else if(val > a[mid]){
                s=mid+1;
            } else {
                l=mid;
            }
        }
        return false;
    }

    public void printElementsGreaterRight(int[] a) {
        int maxSoFar =a[a.length-1];
        // starting from the first leads to brute force solution
        // so i just started frm thr end and keep track of the maximum so far and  i will print based on that
        for(int i=a.length-1; i>0; i--){    
            if(maxSoFar > a[i]){
                continue;
            } else {
                System.out.print(a[i] +" ");
            } 
            if(maxSoFar < a[i]){
                maxSoFar = a[i];
            }
        }
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
        int start =0, end =0;

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
