import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class three {
    public static void main(String[] args) {
        
        // Longest Consecutive Sequence in an Array
        // Problem Statement: You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.

        // int[] arr= {100, 200, 1, 3, 2, 4};
        int[] arr = {3, 8, 5, 7, 6};

        Arrays.sort(arr);

        int ans =Integer.MIN_VALUE, curr_max=1, ref=arr[0] ;

        for(int i=1; i<arr.length; i++) {
            if(ref + 1 == arr[i]) {
                curr_max +=1;
            } else {
                curr_max =1;
            }
            
            ref = arr[i];
            ans = Math.max(ans, curr_max);
        }

        System.out.println(ans);

        System.out.println(longestConsecutive(arr));

    }

    // Opimal approach : 
    public static int longestConsecutive(int[] nums) {
        Set < Integer > hashSet = new HashSet < Integer > ();
        for (int num: nums) {
            hashSet.add(num);
        }

        int longestStreak = 0;

        for (int num: nums) {
            if (!hashSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}