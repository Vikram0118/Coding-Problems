import java.util.*;

public class sixteen {
    // Most frequent word in a String
    public static void main(String[] args) {
        String s = "Best items in category are Samsung and Lenovo. Samsung items are cool and best : lenovo are cool and best as well";
        String[] str = {"are", "in"};
        Map<String, Integer> ResultMap = MySolution (s, str);

        for(Map.Entry<String, Integer> M : ResultMap.entrySet()) {
            System.out.print(M.getKey());
            System.out.print(" - ");
            System.out.print(M.getValue());
            System.out.println();
        }
    }

    public static Map<String, Integer> MySolution (String s, String[] str) {
        s = s.replaceAll("[^a-zA-Z0-9]", " ");
        String[] Words = s.split(" +");

        Map<String, Integer> M = new HashMap<>();

        for(String Word : Words) {
            Word = Word.toLowerCase();
            M.put(Word, M.getOrDefault(Word, 0) +1);
        }

        // if we want to exclude few values
        // for(String st : str) {
        //     if(M.containsKey(st)) {
        //         M.remove(st);
        //     }
        // }

        TreeMap<String, Integer> T = new TreeMap<>( (e1, e2) -> {
                int freq1 = M.get(e1);
                int freq2 = M.get(e2);
                if(freq1  != freq2) {
                    // return freq1 - freq2;
                    return freq2 - freq1;
                }
                return e1.compareTo((e2));
            }
        );
        T.putAll(M);

        Map<String, Integer> ReturnMap = new HashMap<>();

        int topFreq = T.firstEntry().getValue();

        while(!T.isEmpty()) {
            Map.Entry<String, Integer> tempMap = T.pollFirstEntry();
            if(tempMap.getValue() == topFreq) {
                ReturnMap.put(tempMap.getKey(), tempMap.getValue());
            } else {
                break;
            }
            
        }

        return ReturnMap;
    }
}