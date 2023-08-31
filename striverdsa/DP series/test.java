import java.util.*;

class test {
    public static void main(String[] args) {
        // String s = "abccddde";
        // List<Integer> l = new ArrayList<>();
        // l.add(1);
        // l.add(3); 
        // l.add(12);
        // l.add(5);
        // l.add(9);
        // l.add(10);

        // List<String> L = weightedUniformStrings(s, l);
        // System.out.println(L);.

        List<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2); 
        a.add(4);
        a.add(6);
        a.add(1);

        List<Integer> b = new ArrayList<>();
        b.add(2);
        b.add(1); 
        b.add(8);
        b.add(5);

        System.out.println(twoStacks(10, a, b, 0, 0));
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
    // Write your code here
        Set<Integer> set = new HashSet<>();
        List<String> retrunList = new ArrayList<>();
        int i=0;
        while(i < s.length()) {
            char ctemp = s.charAt(i);
            int itemp = (int)ctemp - 96;
            set.add(itemp);

            while(i < s.length() -1 && s.charAt(i+1) == ctemp) {
                itemp += (int)ctemp - 96;
                set.add(itemp);
                i++;
            }
            i++;
        } 
        
        for(int j : queries) {
            if(set.contains(j)) {
                retrunList.add("Yes");
            } else {
                retrunList.add("No");
            }
        }

        System.out.println(set);
        
        return retrunList;
    }

    
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b, int sum, int count) {
        // Write your code here

        if(sum == maxSum) {
            return count;
        }
        twoStacks(maxSum, a, b, sum, );
    }
    
}