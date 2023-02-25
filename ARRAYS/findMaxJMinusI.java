package ARRAYS;

public class findMaxJMinusI {
    public static int maxJMinusI(int[] arr) {
        int n = arr.length, leftMin[] = new int[n], rightMax[] = new int[n], ans = 0;

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);

        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++)
            leftMin[i] = Math.max(leftMin[i - 1], arr[i]);

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {
                ans = Math.max(ans, j - i);
                j++;
            } else
                i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 7, 2, 8, 6, 3, 4 };
        System.out.println(maxJMinusI(arr));
    }
}
