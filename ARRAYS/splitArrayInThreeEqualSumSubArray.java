package ARRAYS;

public class splitArrayInThreeEqualSumSubArray {

    static int ind1 = -1, ind2 = -1;

    // grepper split array in three equal sum sub array java
    public static boolean splitArray(int[] arr) {
        int preSum = 0, S1, S2, sum = 0, n = arr.length;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        if (sum % 3 != 0)
            return false;
        S1 = sum / 3;
        S2 = 2 * S1;
        for (int i = 0; i < n - 1; i++) {
            preSum += arr[i];
            if (preSum == S1 && ind1 == -1)
                ind1 = i;
            else if (preSum == S2 && ind1 != -1) {
                ind2 = i;
                break;
            }
        }
        if (ind1 == -1 || ind2 == -1)
            return false;
        return true;
    }
    // end grepper

    public static void main(String[] args) {
        // int arr[] = { 7, 4, 4, 5, 2, 3, 3, 5 };
        int arr[] = { 6, 1, 1, 13, -1, 0, -10, 20 };
        if (!splitArray(arr))
            System.out.println("Array cannot be divided in 3 equal sum sub arrays");
        else {
            // first subarray
            for (int i = 0; i <= ind1; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            // second sub array
            for (int i = ind1 + 1; i <= ind2; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
            // third sub array
            for (int i = ind2 + 1; i <= arr.length - 1; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}