public class four extends Sorting {
    public static void main(String[] args) {
        // find the misssing number in the range of 1 to n in an unsorted array
        int[] arr = {1, 4, 5, 6, 3, 8, 7};

        System.err.println("The Missing number is :" +UsingCyclicSort(arr));
    }

    public static int SimpleMethd(int[] arr) {
        int sum = 0, ans = (arr.length + 1) * (arr.length + 2) / 2; // Important : Length + 1
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum+ " "+ans);
        return (ans - sum);
    }

    public static int UsingCyclicSort(int[] arr) {
        CyclicSortForMissingNumber(arr);
        print(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == i + 1) {
                continue;
            } else {
                return i + 1;
            }
        } 
        return 0;
    }

    public static void CyclicSortForMissingNumber(int[] arr) {
        //  Only for a small range of values // sorting of 1 to n
        // {2, 3, 1, 4, 6, 5}
        int i=0;
        while(i<arr.length -1) {
            if(arr[i] == i + 1){
                i++;
            } else if (arr[i] > arr.length) {
                i++;
            } else {
                swap(arr, i, arr[i] - 1);
            }
        }
    }

}
