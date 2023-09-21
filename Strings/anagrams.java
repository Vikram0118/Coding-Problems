import java.util.*;

public class anagrams {
    public static void main(String[] args) {
        String S = "bcdcbaba";
        String pattern = "aebc";

        Map<Character, Integer> patternMap = new HashMap<>();
        for(int i=0; i<pattern.length(); i++) {
            patternMap.put(pattern.charAt(i), patternMap.getOrDefault(pattern.charAt(i), 0) + 1);
        } 
        int ref = patternMap.size();

        int start =0; 
        int end =0;

        while(end < S.length() - 1) {
            char temp1 = S.charAt(end);
            if(patternMap.containsKey(temp1)) {
                System.out.println(temp1);
                patternMap.put(temp1, patternMap.get(temp1) - 1);
                if(patternMap.get(temp1) >= 0) {
                    ref--;
                }
            }
            end++;

            if(ref == 0) {
                System.out.println("Anagram is present");
                return;
            }
            
            if((end - start + 1) > patternMap.size()) {
                char temp2 = S.charAt(start);
                if(patternMap.containsKey(temp2)) {
                    patternMap.put(temp2, patternMap.get(temp2) + 1);
                    if(patternMap.get(temp2) > 0) {
                        ref++;
                    }
                }
                start++;
            }
        }
        System.out.println("Anagram is not present");
    }
}