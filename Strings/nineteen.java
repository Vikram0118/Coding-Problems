
public class nineteen {
    public static void main(String[] args) {


        String s = "aabzzzz";
        int[] charCount = new int[26];
        
        for (char each : s.toCharArray()) {
            charCount[each - 'a']++;
        }

        // for (int i : charCount) {
        //     System.out.print(i+" ");
        // }
        
        int max = 0;    // to hold the maximum occurance of a letter
        char maxC = 'a';  // to hold which occur for maximum number of times 
        int total = 0;
        for (int i=0; i<charCount.length; i++) {
            total += charCount[i];
            if (charCount[i] > max) {
                max = charCount[i];
                maxC = (char)(i+'a');
                // System.out.println(maxC);
            }
        }
        
        // System.out.println(total+" "+max+" "+maxC);
        if (total-max < max-1) {
            System.out.println("Nope");
            return;
        }
        
        
        char[] res = new char[s.length()];  // result array
        int idx = 0;
        while (charCount[maxC-'a'] > 0) {
            // System.out.println(charCount[maxC-'a']);
            res[idx] = maxC;
            idx += 2;
            charCount[maxC-'a']--;
        }
        for (int i = 0; i < charCount.length; i++) {
            while (charCount[i] > 0) {
                if (idx >= res.length) {
                    idx = 1;
                }
                res[idx] = (char) (i + 'a');
                idx += 2;
                charCount[i]--;
            }
        }

        System.out.println();
        System.out.println(res);

    }
}

// using heap
// public class Solution {
//   public String reorganizeString(String s) {
//     Map<Character, Integer> count = new HashMap<>();
//     int maxFreq = 0;

//     for (final char c : s.toCharArray())
//       maxFreq = Math.max(maxFreq, count.merge(c, 1, Integer::sum));

//     if (maxFreq > (s.length() + 1) / 2)
//       return "";

//     StringBuilder sb = new StringBuilder();
//     // (freq, c)
//     Queue<Pair<Integer, Character>> maxHeap =
//         new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
//     int prevFreq = 0;
//     char prevChar = '@';

//     for (final char c : count.keySet())
//       maxHeap.offer(new Pair<>(count.get(c), c));

//     while (!maxHeap.isEmpty()) {
//       // Get the most freq letter.
//       final int freq = maxHeap.peek().getKey();
//       final char c = maxHeap.poll().getValue();
//       sb.append(c);
//       // Add the previous letter back so that any two adjacent characters are
//       // not the same.
//       if (prevFreq > 0)
//         maxHeap.offer(new Pair<>(prevFreq, prevChar));
//       prevFreq = freq - 1;
//       prevChar = c;
//     }

//     return sb.toString();
//   }
// }


// 