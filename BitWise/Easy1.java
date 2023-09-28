// get the binary representation of a number

class Easy1 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(inBuildFunction(n));
        System.out.println(divingByTwo(n));
        System.out.println(usingBitWise(n));
        System.out.println(recursively(n));
        System.out.println(recursively(n));
        System.out.println(iterationOfTheAboveRecursion(n));
    }

    // inbuilt function
    static String inBuildFunction(int n) {
        return Integer.toBinaryString(n);
    }

    // iterative - diving by 2
    static String divingByTwo(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder Str = new StringBuilder();
        while(n > 0) {
            int remainder = n % 2;
            Str.append(remainder);
            n = n / 2;
        }
        return new String(Str.reverse());
    }

    // using bitwise operator
    static String usingBitWise(int n) {
        if(n == 0) {
            return "0";
        }
        StringBuilder Str = new StringBuilder();
        int mask = 1 << 31;
        for(int i= 0; i<32 ; i++) {
            char bit = (n & mask) != 0 ? '1' : '0';
            Str.append(bit);
            n <<= 1; 
        }
        return new String(Str);
    }

    // recursively 
    static String recursively(int n) {
        if(n <= 1) {
            return Integer.toString(n);
        }
        return recursively(n >> 1) + Integer.toString(n & 1);
    }

    // iteration of the above recursion

    static String iterationOfTheAboveRecursion(int n) {
        StringBuilder Str = new StringBuilder();

        while(n > 0) {
            Str.append(n&1);
            n >>= 1;
        }

        return new String(Str.reverse());
    }

    // just printing
    static void recursivePrint(int n) {
        if(n > 1) {
            recursively(n >> 1);
        }

        System.out.println(n&1);
    }

}