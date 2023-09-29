// Bit Rotation: A rotation (or circular shift) is an operation similar to shift except that the bits that fall off at one end are put back to the other end. 
// In left rotation, the bits that fall off at left end are put back at right end. 
// In right rotation, the bits that fall off at right end are put back at left end.

public class Easy5 {
    public static void main(String[] args) {
        int n = 5;
        int d = 1;

        rotate16(n, d);
        // rotate32(n, d);
    }

    // for 16 bit number
    static void rotate16(int N, int D) {
        // your code here
        int t=4;  // number of bits
        // int left= ((N<<D) | N>>(t-D)) & 0xFFFF;
        // int right=((N>>D) | N<<(t-D)) & 0xFFFF;  //  0xFFFF is to just make sure only the last 16 bits are taken 

        int left= ((N<<D) | N>>(t-D)) & 0xF;
        int right=((N>>D) | (N<<(t-D) & 0xF));  
        System.out.println(N << (t-D) & 0xF);
        System.out.println("left rotate : "+left);
        System.out.println("right rotate : "+right);
    }

    // for 32 bit number

    /*Function to left rotate n by d bits*/
    static void rotate32(int n, int d) {
        int INT_BITS = 32;

        /* In n<<d, last d bits are 0.
           To put first 3 bits of n at
           last, do bitwise or of n<<d with
           n >>(INT_BITS - d) */
        int left = (n << d) | (n >> (INT_BITS - d)) & 0xFFFFFFFF;

        /* In n>>d, first d bits are 0.
           To put last 3 bits of at
           first, do bitwise or of n>>d
           with n <<(INT_BITS - d) */
        int right = (n >> d) | (n << (INT_BITS - d)) & 0xFFFFFFFF; //  is it not necessary here because this machine uses 32 bit number and adding it is just a safety

        System.out.println(left);
        System.out.println(right);

    }
}
