import java.util.*;

public class seven {
    
    public static void main(String[] args) {
        String s = "bccbababd";
        System.out.println("The number of Unique elements : "+MySolution(s));
    }

    public static int MySolution (String s) {
        Set<Character> H =  new HashSet<>();

        for(int i=0; i<s.length(); i++) {
            H.add(s.charAt(i));
        }

        return H.size();
    }

}
