class Inserting { 

    int count;
    public static void main(String[] args) {
         
        Inserting o = new Inserting();

        int[] arr = new int[5];
        
        for(int i=0; i<arr.length; i++){
            o.insertAtEnd(arr, i+1);
        }

        o.print(arr);

        o.insertAtStart(arr, 0);
        System.out.println();
        o.print(arr);

        System.out.println();
        o.insertAtPosition(arr, 999, 7);
        o.print(arr);

    }

    public void print(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public void insertAtEnd(int arr[], int val) {
        arr[count++] = val;
    }

    public void insertAtStart(int arr[], int val) {
        for(int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];        
        }
        arr[0] = val;
    }

    public void insertAtPosition(int[] arr, int val, int pos) {
        // pos -= 1; for index
        if(pos > arr.length-1){
            System.out.println("Position doesn't exist");
            return;
        }
        for(int i=arr.length-1; i>pos ; i--) {
            arr[i] = arr[i-1];    
        }
        arr[pos] = val;
    } 
}