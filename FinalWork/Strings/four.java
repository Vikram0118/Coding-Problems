import java.util.*;

public class four {
    public static void main(String[] args) {
        // reverse a String

        String s = "Vikuram";
        // System.out.println(UsingCharArray(s));
        // System.out.println(MySolution(s));
        // System.out.println(Optimal(s));
        System.out.println(UsingStack(s));

    }

    public static String UsingStack(String s) {
        Stack<Character> S = new Stack<>();
        int i = 0;
        while(i<s.length()) {
            S.push(s.charAt(i));
            i++;
        }
        String ans="";
        // i = 0;
        // while(i < S.size()) { //  VERY VERY CAREFULL WHILE USING STACK
        while(!S.isEmpty()) { // use this while using stack
            // System.out.println(i);
            ans = ans+S.pop();
            i++;
        }

        return ans;
    }

    public static String Optimal(String s) {
        int start=0, end =s.length()-1;

        while(start < end) {
            s = swap(s.toCharArray(), start, end);
            start ++;
            end --;
        }

        return s;

    }

    public static String MySolution(String s) {
        int end =s.length()-1;
        String ans = "";

        while(end >= 0) {
            char c = s.charAt(end);
            // System.out.println(c);
            ans = ans+c;
            end --;
        }

        return ans;
    }

    public static String UsingCharArray(String s) {
        int end  = s.length() - 1; // IMPORTANT
        int i=0;
        char[] arr = new char[s.length()];

        while(end>=0) {
            arr[i] = s.charAt(end);
            i++;
            end --;
        }

        return new String(arr);
    }

    public static String swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return new String(arr);
    }
}
