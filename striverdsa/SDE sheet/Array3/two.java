class two {
    public static void main(String[] args) {
        // Implement Pow(x,n) | X raised to the power N
        // Problem Statement: Given a double x and integer n, calculate x raised to power n. Basically Implement pow(x, n).
        // System.out.println(MySolution(2.00000, 10));
        double x = 2.1000;
        int n =3;
        // System.out.println(MySolution(x, n));
        System.out.println(BinaryExponentiation(x, n));
        

    }

    public static double BinaryExponentiation(double x, int n) {
        double ans  = 1.0;
        int nn = Math.abs(n);

        while(nn > 0){
            if(nn % 2 != 0) {
                ans *= x;
                nn--;
            } else {
                x *= x;
                nn /= 2;
            }
        }

        return (n<0) ? (1/ans): ans;
    }

    public static double MySolution(double x, double n) {
        double curr =1.0;

        while(n>0) {
            curr *= x;
            n--;
        }
        return curr;
    }
}