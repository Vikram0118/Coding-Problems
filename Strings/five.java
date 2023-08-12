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
                temp.insert(0, s.charAt(i));   // see the differnce // insert - add to front
                // temp.append(s.charAt(i));                               // append - add to back
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
        System.out.println(s.length());

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) != ' '){
                temp = s.charAt(i)+temp;  // reversing the simgle word
            } else {
                ans = ans+temp+" ";
                temp = ""; // REMEMBER WE CAN NEVER STORE A EMPTY SPACE ALONE IN STRING
            }
        }
        ans  = ans+temp;
        System.out.println(ans.length());
        return ans;
    }

    public static String UsingStack(String s) {
        Stack<Character> S = new Stack<>();
        int i = 0;
        String ans="";
        System.out.println(s.length());
        while(i<s.length()) {
            if(s.charAt(i) == ' '){
                System.out.println(S);   // print this and see
                while(!S.isEmpty()) { 
                    ans = ans+S.pop(); // important
                }
                ans = ans+" ";                // WHY adding this ?? Kandupudichitan
            }
            if(s.charAt(i) == ' ') {   // improved a small bug
                i++;
                continue;
            }
            S.push(s.charAt(i));
            i++;
        }

        while(!S.isEmpty()) {     // important - last we have to pop one time 
            ans = ans+S.pop();
        }

        System.out.println(ans.length());
        return ans;
    }
}
