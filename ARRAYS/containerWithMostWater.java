package ARRAYS;

public class containerWithMostWater {

    // grepper container with most water java
    public static int containerMostWater(int[] arr) {
        int area, maxArea = 0, l = 0, r = arr.length - 1, height, distance;
        while (l < r) {
            height = Math.min(arr[l], arr[r]);
            distance = r - l;
            area = distance * height;
            maxArea = Math.max(area, maxArea);
            if (arr[l] >= arr[r])
                r--;
            else
                l++;
        }
        return maxArea;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 1, 2, 6, 2, 5, 4, 8, 3, 8 };
        System.out.println(containerMostWater(arr));
    }
}