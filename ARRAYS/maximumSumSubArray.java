package ARRAYS;

public class maximumSumSubArray {

    // grepper maximum sum subarray java
    public static int maxSumSubarr(int arr[]) {
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum < 0)
                curSum = 0;
            if (curSum > maxSum)
                maxSum = curSum;
        }
        return maxSum;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { -6, 4, 3, -9, 8, 1, -1, -5, 3 };
        System.out.println(maxSumSubarr(arr));
    }
}
