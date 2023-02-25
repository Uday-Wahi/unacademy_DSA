package ARRAYS;

import java.util.Arrays;

public class twoNumsUnsortedArrayGivenSum {

    public static boolean findTwoNumsUnsortedArray(int[] arr, int sum) {
        Arrays.sort(arr);
        return twoNumsSortedArrayGivenSum.findTwoNumsSortedArray(arr, sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 3, 5, -2, 1 }, sum = 8;
        System.out.println(findTwoNumsUnsortedArray(arr, sum));
    }
}
