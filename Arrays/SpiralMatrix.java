import java.util.*;

class SpiralMatrix {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        input.close();

        // ZigZagMayBe(arr);
        System.out.println();
        SprialMatrix(arr);
        
    }

    public static void SprialMatrix(int[][] matrix) {
        int m=matrix.length;
      List<Integer>res=new ArrayList<>();
        if(m==0)
          return;
        int n=matrix[0].length;
        
        int colstart=0;
        int colend=m;
        int rowstart=0;
        int rowend=n;
        
        int k;

        // 1 2 3
        // 4 5 6
        // 7 8 9

        while(rowstart < rowend && colstart < colend) {

            for(k=rowstart; k<rowend; k++) {
                res.add(matrix[rowstart][k]);
            }
            colstart++;

            for(k=colstart; k<colend; k++) {
                res.add(matrix[k][rowend - 1]);
            }
            rowend--;

            if(colstart < colend) {  
                for(k=rowend-1;k>=rowstart;k--)
                res.add(matrix[colend-1][k]);
                colend-=1;
            }

            if(rowstart<rowend)
            {
                for(k=colend-1;k>=colstart;k--)
                res.add(matrix[k][rowstart]);
                rowstart+=1;
            }
        }

        for(int i : res) {
            System.out.print(i+" ");
        }
    }

    public static void ZigZagMayBe(int[][] arr) {
        int i =0, j=0, n = arr.length;
        while(i<n) {
            if(j == 0) {
                while(j<n) {
                    System.out.print(arr[i][j]+" ");
                    j++;
                }
                j--;
            } else {
                while(j>=0) {
                    System.out.print(arr[i][j]+" ");
                    j--;
                }
                j++;
            }
            i++;
        }
    }
}