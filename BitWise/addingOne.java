//  adding one wothout using arithmetic operators

public class addingOne {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(addOne1(n));
        
    }

    // Method 1
    // To add 1 to a number x (say 0011000111), flip all the bits after the rightmost 0 bit (we get 0011000000). Finally, flip the rightmost 0 bit also (we get 0011001000) to get the answer - (all the bits to the right of rightmost zero (including rightmost zero) got flipped)
    static int addOne1(int x) {
        int m = 1;
         
        // Flip all the set bits
        // until we find a 0
        while( (int)(x & m) >= 1) // x & m checks if the rightmost bit of x is set (equal to 1).
        {
            System.out.println(x & m);
            x = x ^ m;  // x = x ^ m flips the rightmost set bit to 0.
            m <<= 1;  // m <<= 1 shifts the set bit in m one position to the left, preparing it to check the next bit in x.
            // System.out.println(m);
        }
     
        // flip the rightmost 0 bit
        x = x ^ m;
        return x;
    }

    //Method 2 
    // We know that the negative number is represented in 2’s complement form on most of the architectures. We have the following lemma hold for 2’s complement representation of signed numbers.
    // Say, x is numerical value of a number, then
    // ~x = -(x+1) [ ~ is for bitwise complement ]
    // (x + 1) is due to the addition of 1 in 2’s complement conversion
    // To get (x + 1) apply negation once again. So, the final expression becomes (-(~x)).

    static int addOne2(int x)
    {
         return (-(~x));
    }
}
