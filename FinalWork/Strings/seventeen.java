import java.util.*;

public class seventeen {
    // get the frequency of every word in a String

    public static void main(String[] args) {
        String s = "Best items in category are Samsung, Lenovo. Samsung items are cool : lenovo are cool";
        Map<String , Integer> M  = mostFrequent(s);

        System.out.println(M);
    }

    public static Map<String, Integer> mostFrequent(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        String[] allWords = s.split(" +");

        System.out.println(allWords);

        Map<String , Integer> M = new HashMap<>();

        for(String word : allWords) {
            word = word.toLowerCase();
            M.put(word, M.getOrDefault(word, 0) + 1);
        }

        //TreeMap sort the value based on the key
        TreeMap<String , Integer> T = new TreeMap<>((e1, e2) -> {
            int freq1 = M.get(e1);
            int freq2 = M.get(e2);

            // if(freq1 != freq2) {
            //     return freq2 - freq1;    // decreasing order
            //     // return freq1 - freq2;   // increasing order
            // }

            return e1.compareTo(e2); // alphabetical
            // return e2.compareTo(e1); // reverse alphabetical
        });

        T.putAll(M);

        return T;
    }
}
