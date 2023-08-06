import java.util.Arrays;

public class ArraysNew {
    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 6, 1};
        int n = arr.length;

        // int  sum = 0;
        // sum = (n+1)*(n+2) / 2;
        // for(int i=0; i<n; i++){
        //     sum -= arr[i];
        // }
        // System.out.println("THE MISSING NUMBER IS : "+sum);

        // Arrays.sort(arr);
        
        int i=0;

        while(i < n){    // 3, 2, 4, 6, 1
            if(arr[i] > n){
                i++;
                continue;
            }
            if(arr[i] == i+1){
                i++;
            } else {
                int pos = arr[i] -1;
                int swp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = swp;
            }
        }
        
        int temp = 1;
        while( temp < n+1){
            if(temp == arr[temp-1]) {
                temp++;
                continue;
            } else {
                System.out.println("THE MISSING NUMBER IS : "+temp);
                return;
            }
        }

    }
}

