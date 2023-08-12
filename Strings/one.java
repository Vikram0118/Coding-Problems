public class one {
    public static void main(String[] args) {
        // find the first character of every word in a string

        String s = "Hello User!! Welcome";
        char[] arr = s.toCharArray();

        // for(int i=0; i<arr.length; i++) {
        //     if(arr[i] !=' '){
        //         if(i == 0) {
        //             System.out.print(arr[i]+" ");
        //         } else if (arr[i-1] == ' '){
        //             System.out.print(arr[i]+" ");
        //         }
        //     }
        // }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] !=' ' && (i == 0 || arr[i-1] == ' ')){
                System.out.print(arr[i]+" ");
            }
        }

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) !=' ' && (i == 0 || s.charAt(i-1) == ' ')){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
