public class sixteen {
    public static void main(String[] args) {
        // video - 31 - shuffle given array numbers

        int[] arr = {3, 7, 4, 1, 8, 9, 10};

        for(int i=0; i<arr.length; i++) {
            int r = (int)Math.floor(Math.random() * arr.length );
            // System.out.println(r);
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
