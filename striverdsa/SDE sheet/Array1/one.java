public class one {
    public static void main(String[] args) {
        int[][] arr= {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int[][] arr1 = new int[arr.length][arr[0].length];

        for(int i=0; i<arr.length; i++) {
            for(int j=0;j<arr[0].length; j++) { 
                arr1[i][j] = arr[i][j];
            }
        }

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr1[0].length; j++) { 
                if(arr1[i][j] == 0) {
                    for(int k=0; k<arr1.length;k++) {
                        arr[k][j] = 0;
                        arr[i][k] = 0;
                    }
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0;j<arr[0].length; j++) { 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}