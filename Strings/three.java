
public class three {
    public static void main(String[] args) {
        // replace the word in string
        String s = "hello hello!! Welcome to kirigalan magic show";

        // System.out.println(s.repeat(2));
        // System.out.println(s.replace("hello", "Vikram"));  // case sensitive
        // System.out.println(s.replace("!", "?"));
        // System.out.println(s.replaceAll("hello", "Vikram"));
        // System.out.println(s.replaceFirst("hello", "Vikram"));



        // String str = "This is a Car and i love bike";
        System.out.println(MySolution(s, "hello", "Bike"));

    }

    public static String MySolution(String s, String s1, String s2) {
        // s = s.replaceAll("[^a-zA-Z0-9]", " ");
        String[] str = s.split(" +");

        for(int i=0; i<str.length; i++) {
            if(str[i].equals(s1)) {
                str[i] = s2;
            }
            // System.out.println(str[i]);
        }

        return new String(String.join(" ", str));      // joins a values of String array to a single string
    }
}
