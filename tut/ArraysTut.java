import java.util.Arrays;

public class ArraysTut {

    int count =0;
    public static void main(String[] args) {
        // starting array
        int[] a = new int[5];
        ArraysTut o = new ArraysTut();

        //---------------------------inserting element into ana array ( time : 9:40 ) ------------------------------
        // before inserring anything it will print 0
        // while "inserting at the end" there is no major problem, we just need to take care of the size of the array .
        // while "inserting at the begining" we need to shift all the element next to it by one position .
        // a[0] = 12; // inserting at the end
        // a[1] = 34;
        // a[2] = 15;
        // a[3] = 67;
        // a[4] = 48;

        for(int j=0; j<a.length; j++) { // using method
            o.insertAtEnd(a, j+1);
        }
        o.insertAtStart(a, 40);
        o.insertAtPosition(a, 50, 2);
        o.printArray(a);

    }
    public void printArray(int a[]){
        for(int i =0; i<a.length; i++){
            System.out.print(a[i]+" "); 
        }
    }

    public void insertAtEnd(int[] a, int val) {
        a[count++] = val;
    }

    public void insertAtStart(int[] a, int val) {
        // for(int i=a.length-1; i>=0; i--){
        //     if(i==0){       // why did i check every time :(.....it is know i m going to insert at index 0 so this is unwanted
        //         a[i] =val;
        //         return;
        //     }
        //     a[i] = a[i-1];
        // }
        for(int i=a.length-1; i>0; i--){  // better
            a[i] = a[i-1];
        }
        a[0] = val;
    }

    public void insertAtPosition(int[] a, int val, int position) {
        if(position > a.length){
            System.out.println("SPECIFIED POSITION DOESN'T EXISTS");
            return;
        } else {
            for(int i=a.length-1; i>=0; i--){
                if(i==(position-1)){
                    a[i] =val;
                    return;
                }
                a[i] = a[i-1];
            }
        }
    }
}
