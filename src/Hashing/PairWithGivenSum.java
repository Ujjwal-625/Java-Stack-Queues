package Hashing;

import java.util.*;

public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> set = new HashSet<>(); // Store visited numbers

        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair found: (" + num + ", " + (target - num) + ")");
                return true;
            }
            set.add(num);
        }

        System.out.println("No pair found.");
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 10, 12};
        int target = 15;
        hasPairWithSum(arr, target);
    }
}
