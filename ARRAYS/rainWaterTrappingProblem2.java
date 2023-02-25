package ARRAYS;

public class rainWaterTrappingProblem2 {

    // rain water trapping problem using O(1) space complexity
    public static int maxRainWaterTrapped(int[] arr) {
        int maxRainWater = 0, left = 0, right = arr.length - 1, leftMax = 0, rightMax = 0;
        while (left < right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] > leftMax)
                    leftMax = arr[left];
                else
                    maxRainWater += leftMax - arr[left];
                left++;
            } else {
                if (arr[right] > rightMax)
                    rightMax = arr[right];
                else
                    maxRainWater += rightMax - arr[right];
                right--;
            }
        }
        return maxRainWater;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 7, 2, 6, 5, 4 };
        System.out.println(maxRainWaterTrapped(arr));
    }
}
