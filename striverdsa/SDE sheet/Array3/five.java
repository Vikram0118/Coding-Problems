class five {
    public static void main(String[] args) {
        // Grid Unique Paths | Count paths from left-top to the right bottom of a matrix
        // Problem Statement: Given a matrix m X n, count paths from left-top to the right bottom of a matrix with the constraints that from each cell you can either only move to the rightward direction or the downward direction.
        System.out.println(UsingRecursion(0, 0, 3, 7));
    }

    public static int UsingRecursion(int i, int j, int n, int m) {
        if( i == (n-1) && j == (m-1)) {
            return 1;
        }
        if(i>=n || j>=m) {
            return 0;
        } else {
            return UsingRecursion(i+1, j, n, m) + UsingRecursion(i, j+1, n, m); 
        }
    }
}