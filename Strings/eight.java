import java.util.*;

public class eight {
 
    public static void main(String[] args) {
        // Longest substring length with K-distinct character

        String s = "bccbababddddddddd";
        System.out.println(Best(s, 2));
        
    }

    public static int Best (String s, int k) {
        int max=0;
        int start =0, end =0;
        Map<Character, Integer> M = new HashMap<>();

        while(end < s.length()) {
            char c = s.charAt(end);
            M.put(c, M.getOrDefault(c, 0) + 1);

            // if(M.size() > k)
            while(M.size() > k) {      // always keep tracking if the window has k distinct characters
                char c1 = s.charAt(start);
                M.put(c1, M.get(c1) - 1);

                if(M.get(c1) == 0) {
                    M.remove(c1);
                }
                start++;
            }

            max = Math.max(max, (end - start + 1));
            end++;
        }

        return max;
    }
}
   