// add two bit strings

public class Easy3 {
    public static void main(String[] args) {
        String s1 = "1100011";
        String s2 = "10";
        System.out.println(Solution(new StringBuilder(s1),new StringBuilder(s2)));
        System.out.println(withoutPadding(new StringBuilder(s1),new StringBuilder(s2)));
    }

    static String Solution(StringBuilder s1, StringBuilder s2) {
        StringBuilder Str = new StringBuilder();

        // first we have to make  the string to in equal length - padding zeros
        int length= s1.length();
        if(s1.length() != s2.length()) {
            length = makeLengthEqual(s1, s2, s1.length(), s2.length());
        }

        int carry = 0;

        for(int i=length - 1; i>=0; i--) {

            int first = s1.charAt(i) - '0';
            int second = s2.charAt(i) - '0';
            // System.out.println(first +" -- "+second);
            int sum = (first ^ second ^ carry) + '0';  // still dont understand this
            // System.out.println((char)sum+" --- "+sum);

            Str.insert(0, (char)sum); // don't forget to cast it to char

            // calculating carry 
            // boolean expression for 3-bit addition
            carry = (first & second) | (second & carry) | (first & carry);
        }

        // // if overflow, then add a leading 1
        if (carry == 1) {
            Str.insert(0, carry);
        }
        return new String(Str);
    }

    static int makeLengthEqual(StringBuilder s1, StringBuilder s2, int len1, int len2) {
        if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i++)
                s1.insert(0, '0');
            return len2;
        } else {
            for (int i = 0; i < len1 - len2; i++)
                s2.insert(0, '0');
        }
 
        return len1;
    }


    static String withoutPadding(StringBuilder s1, StringBuilder s2) {
        StringBuilder Str = new StringBuilder();
        int carry = 0;
        int l1 = s1.length() -1;
        int l2 = s2.length() -1;
        // System.out.println(l1+" -- "+l2);

        while(l1 >= 0 || l2 >= 0 || carry == 1) {
            if(l1 >= 0) {
                carry += s1.charAt(l1) - '0';
                l1--;
            }
            if(l2 >= 0) {
                // System.out.println(s2.charAt(l2) - '0');
                carry += s2.charAt(l2) - '0';
                l2--;
            }
            Str.append(carry % 2);
            carry /= 2;
        }

        return new String(Str.reverse());
    }
}
