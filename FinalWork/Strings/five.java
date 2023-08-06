import java.util.Stack;

public class five {
    public static void main(String[] args) {
        // Reverse individual words
        String s = "Coding Simplified Nice";

        // System.out.println(UsingStack(s));
        // System.out.println(UsingSimpleLoop(s));
        System.out.println(UsingStringBuilder(s));

    }

    public static String UsingStringBuilder(String s) {
        StringBuilder ans = new StringBuilder(); // differnec between string buffer and string builder
        StringBuilder temp = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' '){
                temp.insert(0, s.charAt(i));   // see the differnce
                // temp.append(s.charAt(i));
                // System.out.println(temp);
            } else {
                ans = ans.append(temp).append(" ");
                temp.setLength(0);; // REMEMBER WE CAN NEVER STORE A EMPTY SPACE ALONE IN STRING
            }
        }
        ans  = ans.append(temp);
        return new String(ans);
    }

    public static String UsingSimpleLoop(String s) {
        String ans="", temp ="";

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' '){
                temp = s.charAt(i)+temp;
            } else {
                ans = ans+temp+" ";
                temp = ""; // REMEMBER WE CAN NEVER STORE A EMPTY SPACE ALONE IN STRING
            }
        }
        ans  = ans+temp;
        return ans;
    }

    public static String UsingStack(String s) {
        Stack<Character> S = new Stack<>();
        int i = 0;
        String ans="";
        while(i<s.length()) {
            if(s.charAt(i) == ' '){
                while(!S.isEmpty()) { 
                    ans = ans+S.pop(); // important
                }
                ans = ans+" ";                
            }
            S.push(s.charAt(i));
            i++;
        }
        while(!S.isEmpty()) { 
            ans = ans+S.pop();
        }
        return ans;
    }
}
