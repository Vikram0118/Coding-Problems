public class Easy4 {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(MySolution(n));
        System.out.println(BestSolution(n));
    }

    static int BestSolution(int n) {
        // The rightmost set bit can be switched off by subtracting the LSB from the number.
        //The LSB of a number can be obtained using (n & (-n)), therefore the number with the rightmost set bit of n switched off is equal to n – (n & (-n));
        // System.out.println(n & (-n));

        // -n is the 2's complimenet of n
        // see PICTURE - method 1
        return n - (n & (-n));

        // see PICTURE - method 2
        // return n & (n - 1);
    }

    static int MySolution(int n) {
        StringBuilder Str = new StringBuilder();

        while(n > 0) {
            int bit = n & 1;
            Str.append(bit);
            n >>= 1;
        }
        int ans = 0;
        int ref = 1;
        boolean change = true;

        for(int i=0; i<Str.length(); i++) {
            if(Str.charAt(i) == '1' && change) {
                Str.setCharAt(i, '0');
                change = false;
            }
            // System.out.println(ans+" -- "+ref);

            ans += ((Str.charAt(i)- '0') * ref);
            ref += ref;
        }

        return ans;
    }
}
