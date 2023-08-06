class LeetCode {
    public static void main(String[] args) {

        // finding the length of the lastword
        String s = "hello world    ";
        System.out.println(LengthOfLastString(s));
    }



    public static int LengthOfLastString(String s) {
        int i = s.length() -1;

        // for triming
        while(i>=0 && s.charAt(i) == ' ')
            i--;

        // traversing the last word
        int lastPos = i;

        while(i>=0 && s.charAt(i) != ' ') {
            i--;
        }

        return lastPos - i  ;
    }
}