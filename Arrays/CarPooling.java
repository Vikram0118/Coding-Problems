import java.util.*;

class CarPooling {
    public static void main(String[] args) {
        int[][] trips = { {2, 1, 5}, {3, 3, 7}};
        Map<Integer, Integer> map = new HashMap<>();
        int capacity = 5;

        for(int[] t : trips) {
            map.put(t[1], map.getOrDefault(t[1], 0) + t[0]);
            map.put(t[2], map.getOrDefault(t[2], 0) - t[0]);
        }

        int currCap =0;
        for(Map.Entry<Integer, Integer> M : map.entrySet()) {
            currCap += M.getValue();
            if(currCap > capacity) {
                System.out.println("nope");
            }
        }
        System.out.println("Yes");
    }
}
