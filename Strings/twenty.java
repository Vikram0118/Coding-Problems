import java.util.*;

public class twenty {
    public static void main(String[] args) {
        int n = 123421;
        Map<Integer, Character> M = new HashMap<>();
        StringBuilder Sb = new StringBuilder();
        List<Character> vol = new ArrayList<>();
        vol.add('a');
        vol.add('e');
        vol.add('i');
        vol.add('o');
        vol.add('u');
        int normalChar = 1;
        int volChar = 0;

        while(n>0) {
            int temp = n%10;
            if(M.containsKey(temp)) {
                Sb.insert(0, M.get(temp));
            } else  {
                char tempChar = ' ';
                if(isPrime(temp)) {
                    tempChar = vol.get(volChar);
                    Sb.insert(0, tempChar);
                    M.put(temp, tempChar);
                    volChar++;
                } else {
                    while(vol.contains((char)(normalChar + 96))) {
                        normalChar++;
                    }
                    tempChar = (char)(normalChar + 96);
                    Sb.insert(0, tempChar);
                    M.put(temp, tempChar);
                    normalChar++;
                }
            }
            n /= 10;
        }

        System.out.println(Sb);
    }   

    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1)
            return false;
        // Check from 2 to n/2
        for (int i = 2; i < Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}