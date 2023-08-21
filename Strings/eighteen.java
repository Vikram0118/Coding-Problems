// Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

class eighteen {
    public static void main(String[] args) {
        System.out.println(MySolution("abab"));
        System.out.println(LeetCodeBest("abab"));
        System.out.println(CleverSolution("abab"));
    }

    public static boolean LeetCodeBest(String s) {
        int len = s.length();
    
        for(int i = len / 2; i > 0; i--){
            if(len % i == 0 && s.charAt(i - 1) == s.charAt(len - 1)){
                String ss = s.substring(0, i);
                int repeat = len / i;
                if(ss.repeat(repeat).equals(s)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean CleverSolution(String s) {
        String t = s + s;
        System.out.println(t);
        System.out.println(t.substring(1, t.length() - 1));
        if (t.substring(1, t.length() - 1).contains(s))
            return true;
        return false;
    }

    public static boolean MySolution(String s) {
        String str = " ";
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == str.charAt(0)) {
                int n = s.length() / str.length();
                String temp = str.repeat(n);
                if(temp.equals(s)) return true;
                else str += s.charAt(i);
            } else {
                str = str.trim();
                str += s.charAt(i);
            }
        }

        return false;
    }
}