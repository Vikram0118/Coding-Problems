import java.util.*;

public class six {
    public static void main(String[] args) {
        // Reverse word in given string 

        String s = "Hello World Vikram Palani";
        // System.out.println(UsingStack(s));
        // System.out.println(UsingIteration(s));
        System.out.println(ReverseString(s));
        System.out.println();

    }

    public static String ReverseString(String s) {
        int start=0, end =s.length()-1;

        while(start < end) {
            s = swap(s.toCharArray(), start, end);
            start ++;
            end --;
        }

        System.out.println(s);
        
        StringBuilder ans = new StringBuilder(); // differnec between string buffer and string builder
        StringBuilder temp = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' '){
                temp.insert(0, s.charAt(i));
                System.out.println(temp);
            } else {
                ans = ans.append(temp).append(" ");
                temp.setLength(0);; // REMEMBER WE CAN NEVER STORE A EMPTY SPACE ALONE IN STRING
            }
        }
        ans  = ans.append(temp);
        return new String(ans);
    }

    public static String UsingIteration(String s) {
        StringBuffer ans = new StringBuffer();
        StringBuffer temp = new StringBuffer();

        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) != ' ') {
                // temp = temp.append(s.charAt(i));
                temp.append(s.charAt(i));
            } else {
                // ans.insert(0, temp);
                // ans.insert(0, " ");
                ans.insert(0, temp).insert(0, " ");
                temp.setLength(0);
            }
        }
        ans.insert(0, temp);

        return new String(ans);
    }

    public static String UsingStack(String s) {
        Stack<Character> S = new Stack<>();
        StringBuffer ans = new StringBuffer();

        for(int i = s.length() -1; i>=0; i--) {
            if(s.charAt(i) != ' ') {
                S.push(s.charAt(i));
            } else {
                while(!S.isEmpty()) {
                    ans = ans.append(S.pop());
                }
                ans = ans.append(" ");
            }
        }
        while(!S.isEmpty()) {
            ans = ans.append(S.pop());
        }

        return new String(ans);
    }

    public static String swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return new String(arr);
    }
}
