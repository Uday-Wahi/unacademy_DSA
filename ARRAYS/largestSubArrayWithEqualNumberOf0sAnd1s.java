package ARRAYS;

import java.util.HashMap;

public class largestSubArrayWithEqualNumberOf0sAnd1s {

    // grepper largest sub array with equal number if 0's and 1's java
    public static int largestSubArrayEqual0sAnd1s(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0, endingIndex = -1, n = arr.length, startindex;
        for (int i = 0; i < n; i++)
            arr[i] = (arr[i] == 0) ? -1 : 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
                endingIndex = i;
            }
            if (map.containsKey(sum)) {
                if (maxLen < i - map.get(sum)) {
                    maxLen = i - map.get(sum);
                    endingIndex = i;
                }
            } else
                map.put(sum, i);
        }
        for (int i = 0; i < n; i++)
            arr[i] = (arr[i] == -1) ? 0 : 1;
        startindex = endingIndex - maxLen + 1;
        System.out.println(startindex + " to " + endingIndex);
        return maxLen;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 1, 0, 1, 1, 0 };
        largestSubArrayEqual0sAnd1s(arr);
    }
}