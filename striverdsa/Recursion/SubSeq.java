import java.util.*;

class SubSeq {
    public static void main(String[] args) {
        // subsequence - contigious or non-contigious sequence that follows an order
        // power set method - understand that also 
        List<Integer> L = new ArrayList<>();
        L.add(3);
        L.add(2);
        L.add(1);
        // 3 2 1
        // 3 2
        // 3 1
        // 2 1
        // 
        List<Integer> bucket = new ArrayList<>();
        PrintSubSequence(0, L, bucket, L.size(), 3);
    }

    public static void PrintSubSequence(int index, List<Integer> L, List<Integer> bucket, int n, int k) {
        if(index == n) {
            PrintArray(bucket, k);
            return ;
        }

        bucket.add(L.get(index));
        PrintSubSequence(index + 1, L, bucket, n, k);
        bucket.remove(L.get(index));
        PrintSubSequence(index + 1, L, bucket, n, k);
    }

    public static void PrintArray(List<Integer> L, int k) {
        for(int i : L) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
