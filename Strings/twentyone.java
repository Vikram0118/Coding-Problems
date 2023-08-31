import java.util.*;

public class twentyone {
    public static void main(String[] args) {
        String S = "abdc";
        String temp = "";

        TreeSet<String> T = new TreeSet<>();

        for(int i=0; i<S.length(); i++) {
            temp = "";
            for(int j=i; j<S.length(); j++) {
                temp += S.charAt(j);
                T.add(temp);
            }
        }
        System.out.println(T);
        System.out.println(T.last());
    }
}
