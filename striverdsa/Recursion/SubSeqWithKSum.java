import java.util.*;

public class SubSeqWithKSum {
     public static void main(String[] args) {
        // subsequence - contigious or non-contigious sequence that follows an order
        // power set method - understand that also 
        List<Integer> L = new ArrayList<>();
        L.add(3);
        L.add(2);
        L.add(1);
        List<Integer> bucket = new ArrayList<>();
        PrintSubSequence(0, L, bucket, L.size(), 3, 0);
    }

    public static void PrintSubSequence(int index, List<Integer> L, List<Integer> bucket, int n, int k, int curr) {
        if(index == n) {
            if(k == curr) {
                PrintArray(bucket, k);   
            }
            return ;
        }

        bucket.add(L.get(index));
        curr += L.get(index);
        PrintSubSequence(index + 1, L, bucket, n, k, curr);
        bucket.remove(L.get(index));
        curr -= L.get(index);
        PrintSubSequence(index + 1, L, bucket, n, k, curr);
    }

    public static void PrintArray(List<Integer> L, int k) {
        for(int i : L) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
