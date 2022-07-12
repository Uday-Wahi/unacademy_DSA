package ARRAYS;

public class minimumSumSubArray {

    // grepper minimum sum sub array java
    public static int minSumSubarr(int[] arr) {
        int curSum = 0, minSum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (curSum > 0)
                curSum = arr[i];
            else
                curSum += arr[i];
            if (curSum < minSum)
                minSum = curSum;
        }
        return minSum;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 6, 4, 3, 9, 2, 1, 1, 5, 3 };
        System.out.println(minSumSubarr(arr));
    }
}
