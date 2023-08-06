import java.util.*;

public class nine {
 
    public static void main(String[] args) {
        // Longest substring length with no repeating character

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
                start = Math.max(start, M.get(c) + 1);
            }

            M.put(c, end);
            max = Math.max(max, (end - start + 1));
            end ++;
        }

        return max;
    }
}
   