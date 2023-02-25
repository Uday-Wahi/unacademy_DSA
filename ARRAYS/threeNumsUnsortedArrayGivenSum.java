package ARRAYS;

import java.util.Arrays;

public class threeNumsUnsortedArrayGivenSum {

    public static boolean findThreeNumsUnsortedArray(int[] arr, int sum) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int newSum = sum - arr[i];
            if (findTwoNumsSortedArrayFromStartIndex(arr, newSum, i))
                return true;
        }
        return false;
    }

    public static boolean findTwoNumsSortedArrayFromStartIndex(int[] arr, int sum, int index) {
        int l = index + 1, r = arr.length - 1, curSum = 0;
        while (l < r) {
            curSum = arr[l] + arr[r];
            if (curSum > sum)
                r--;
            else if (curSum < sum)
                l++;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 3, 5, -2, 1 }, sum = 16;
        System.out.println(findThreeNumsUnsortedArray(arr, sum));
    }
}