// count set bits in an integer

public class Easy2 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(Solution1(n));
        System.out.println(Solution2(n));
        System.out.println(Solution3(n));
    }

    // the way that comes to my mind
    static int Solution1(int n) {
        if(n == 0) {
            return 0;
        }
        int count =0;
        while(n > 0) {
            count += (n % 2) & 1;
            n /= 2;
        }
        return count;
    }

    // solution 1 and 3 are same but the with the very little differnce in the way the binary represenation is traversed
    static int Solution3(int n) {
        int count =0;

        while(n > 0) {
            count += (n&1) == 1 ? 1 : 0;
            n >>= 1;
        }

        return count;
    }

    // the way that comes to my mind
    static int Solution2(int n) {
        if(n < 1) {
            return 0;
        }
        if(n == 1) {
            return n;
        }
        return Solution1(n >> 1) + (n%1); 
    }
}
