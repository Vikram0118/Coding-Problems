public class Deletion {

    static int count = 5;
    public static void main(String[] args) {

        Deletion o = new Deletion();

        int[] arr = {12, 34, 45, 6, 13};

        o.print(arr);

        // o.deletAtEnd(arr);
        // System.out.println();
        // o.print(arr);

        // o.deletAtPosition(arr, 1);
        // System.out.println();
        // o.print(arr);

        o.deletValue(arr, 102);
        System.out.println();
        o.print(arr);

    }

    public void print(int arr[]) {
        for(int i=0; i<count; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void deletAtEnd(int arr[]) {
        // arr[arr.length-1] = 0;
        if(arr.length == 0) {
            System.out.println("Array is already Empty");
            return;
        }
        count --; 
    }

    public void deletAtPosition(int arr[], int pos) {
        if(count == 0) {
            System.out.println("Array is already Empty");
            return;
        }
        if(pos > count || pos < 0){
            System.out.println();
            System.out.print("Invalid Position");
        }
        for(int i = pos; i<count -1; i++){
            arr[i] = arr[i+1];
        }
        count --;
    }

    public void deletValue(int arr[], int val) {
        if(count == 0) {
            System.out.println("Array is already Empty");
            return;
        }
        for(int i = 0; i<count; i++){
            if(arr[i] == val) {
                deletAtPosition(arr, i);
                return;
            }
        }
        System.out.println();
        System.out.print(val+" doesn't exists in the array");
    }

}
