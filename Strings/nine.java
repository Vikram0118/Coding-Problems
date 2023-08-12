import java.util.*;

public class nine {
 
    public static void main(String[] args) {
        // Longest substring length with no repeating character
        // imporatnt logic to understand - great maintaining of the window

        String s = "babccbacd";
        System.out.println(Best(s));
    }

    public static int Best (String s) {
        int max=0;
        int start =0, end =0;

        Map<Character, Integer> M = new HashMap<>();

        while(end < s.length()) {
            char c = s.charAt(end);

            if(M.containsKey(c)) {
                start = Math.max(start, M.get(c) + 1);  // important
            }

            M.put(c, end);   // i m adding the position of the character
            max = Math.max(max, (end - start + 1));
            end ++;
        }

        return max;
    }
}
   