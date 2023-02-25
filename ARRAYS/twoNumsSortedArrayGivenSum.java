package ARRAYS;

public class twoNumsSortedArrayGivenSum {

    public static boolean findTwoNumsSortedArray(int[] arr, int sum) {
        int l = 0, r = arr.length - 1, curSum = 0;
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
        int arr[] = { 1, 2, 7, 8, 10, 12 }, sum = 15;
        System.out.println(findTwoNumsSortedArray(arr, sum));
    }
}
