import java.util.*;

class FacePrep {
    public static void main(String[] args) {
        // subsequence - contigious or non-contigious sequence that follows an order
        // power set method - understand that also 
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> L = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> returnBucket = new ArrayList<>();
        for(int i=0; i<n ; i++) {
            L.add(input.nextInt());
        }

        returnBucket = PrintSubSequence(0, L, B, n -1, returnBucket);
        PrintArray(returnBucket);

        input.close();
    }

    public static List<Integer> PrintSubSequence(int index, List<Integer> L, List<Integer> bucket, int n, List<Integer> returnBucket) {

        if(index == n) {
            if(Check_Condition(bucket)) {
                if(bucket.size() > returnBucket.size()) {
                    // System.out.println(bucket);
                    return new ArrayList<>(bucket); // WHY
                    // return bucket; // WHY NOT ??   // understood
                    // Creating a New Bucket List: In the original code, you were modifying the bucket list directly, and this was causing unintended changes in subsequent iterations of the recursion. When you added an element to the bucket, it remained there for the entire recursion even after the recursive calls returned. This affected the correctness of the algorithm. By creating a new list using new ArrayList<>(bucket) and passing it to subsequent recursive calls, you ensure that each recursive call has its own separate copy of the bucket list.
                }
            }
            return null;
        }

        bucket.add(L.get(index));
        returnBucket = (PrintSubSequence(index + 1, L, bucket, n, returnBucket) == null) ? returnBucket : PrintSubSequence(index + 1, L, bucket, n, returnBucket) ;
        bucket.remove(bucket.size() - 1); 
        //Removing Last Element from Bucket: After exploring one branch of recursion with an element included in the bucket, you need to backtrack and try the other branch without that element. To do this, you should remove the last element from the bucket before trying the other branch. This ensures that the bucket list accurately represents the current state of the subsequence you're constructing during each recursive call.
        returnBucket = (PrintSubSequence(index + 1, L, bucket, n, returnBucket) == null) ? returnBucket : PrintSubSequence(index + 1, L, bucket, n, returnBucket) ;

        return returnBucket;
    }

    public static boolean Check_Condition(List<Integer> B) {
        if(B.size() < 1) {
            return false;
        }
        for(int i=0; i < B.size() - 1; i++) {
            if(B.get(i) > B.get(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static void PrintArray(List<Integer> L) {
        for(int i : L) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
