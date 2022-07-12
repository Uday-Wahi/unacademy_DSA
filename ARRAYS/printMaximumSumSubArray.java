package ARRAYS;

public class printMaximumSumSubArray {

    // grepper print elements of maximum sum subarray java
    public static void printMaxSumSubarr(int[] arr) {
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum < 0) {
                start = i + 1;
                curSum = 0;
            }
            if (curSum > maxSum) {
                maxSum = curSum;
                end = i;
            }
        }
        for (int i = start; i <= end; i++)
            System.out.print(arr[i] + " ");
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { -6, -4, 3, 9, 8, 1, -1, -5, 3 };
        printMaxSumSubarr(arr);
    }
}
