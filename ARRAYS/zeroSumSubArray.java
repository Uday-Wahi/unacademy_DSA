package ARRAYS;

import java.util.HashSet;
import java.util.Set;

public class zeroSumSubArray {

    // grepper zero sum sub array java
    public static boolean zeroSum(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int n = arr.length, sum = 0;
        for (int i = 1; i < n; i++) {
            sum += arr[i];
            if (set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 4, 3, 1, -4, 3, 5, 6 };
        System.out.println(zeroSum(arr));
    }
}