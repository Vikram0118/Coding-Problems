class one{
    public static void main(String[] args) {
        // Search in a sorted 2D matrix
        // Problem Statement: Given an m*n 2D matrix and an integer, write a program to find if the given integer exists in the matrix.

        // Given matrix has the following properties:

        // Integers in each row are sorted from left to right.
        // The first integer of each row is greater than the last integer of the previous row
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int search = 30;

        // Mysolution(arr, search);
        UsingBinarySearch(arr, search);

        
        
    }

    public static void UsingBinarySearch(int[][] arr, int search) {
        int n = arr.length, m = arr[0].length;
        int low =0, high = (n * m) -1;

        while(low <= high) {
            int mid = (low + (high - low) / 2);
            if(arr[mid/m][mid%m] == search) {
                System.out.println("Search successfull");
                System.out.println("Element found at position [ "+mid/m+","+mid%m+" ]");
                return; 
            } else if(arr[mid/m][mid%m] < search) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
    }

    public static void Mysolution(int[][] arr, int search) {

        int i =0, j=arr[0].length -1; // row traverse
        int k=0;

        if(search < arr[k][i] || search > arr[arr.length-1][j]) {
            System.out.println("elemnt not in the array");
            return;
        }

        while(k<arr.length) {
            if(search >= arr[k][i] && search <= arr[k][j]) {
                while(i<=j) {
                    if(arr[k][i] == search) {
                        System.out.println("Search successfull");
                        System.out.println("Element found at position [ "+k+","+i+" ]");
                        return; 
                    } else {
                        i++;
                    }
                }
            } else {
                k++;
            }
        }

    }
}