import java.util.*;

public class ten {
    public static void main(String[] args) {
        // compare two strings with backspace character
        String s1 = "bcd##c";
        String s2 = "bd#c";

        System.out.println(MySolution(s1, s2));
    }

    public static Boolean MySolution (String s1, String s2) {
        String S1 = GetString(s1);
        String S2 = GetString(s2);
        System.out.println(S1+" "+S2);

        return (S1.equals(S2)) ? true : false;

    }

    public static String GetString(String s) {
        Stack<Character> S = new Stack<>();
        int i=0;
        String ans = "";

        while(i<s.length()) {
            char c = s.charAt(i);
            if(c != '#') {
                S.push(c);
            } else {
                S.pop();
            }
            i++;
        }

        while(!S.isEmpty()) {
            ans = S.pop()+ans;
        }

        return ans;
    }
}
