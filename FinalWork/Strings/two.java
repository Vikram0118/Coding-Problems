public class two {
    public static void main(String[] args) {
        // Trim the string without using trim function
        String s = "       H                     ";
        System.out.println(s.trim());
        char[] arr = s.toCharArray();

        int start=0 , end=arr.length -1;

        while(arr[start] == ' ' || arr[end]  == ' ') {
            if(arr[start] == ' ') start ++;
            if(arr[end] == ' ') end--;
        }

        System.out.println(new String(arr, start, (end - start + 1)));  // important
    }
}
