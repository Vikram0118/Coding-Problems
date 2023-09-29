// modulas

public class Easy6 {
    public static void main(String[] args) {
        int n = 6;
        int d = 2;
        System.out.println(Solution1(n, d));
    }


    //let n = 6, d = 4 and n%d = 2
    // 6 = 0110
    // 4 = 0100
    // 2 = 0010
    // Let ith bit from right is set in d. For getting n modulus d, we just need to return 0 to i-1 (from right) bits of n as they are and other bits as 0.
    static int Solution1(int n, int d) {
        return ( n & (d-1) );
    }    
     
}
