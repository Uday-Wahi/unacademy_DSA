package ARRAYS;

public class replaceWithGreatestElementOnRight {

    // grepper replace with greatest element on right side java
    public static int[] replaceWithRightElement(int[] arr) {
        int size = arr.length;
        int maxRight = arr[size - 1];
        arr[size - 1] = 0;
        for (int i = size - 2; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = maxRight;
            if (maxRight < temp)
                maxRight = temp;
        }
        return arr;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 7, 5, 8, 9, 6, 8, 5, 7, 4, 6 };
        for (int i : replaceWithRightElement(arr))
            System.out.print(i + " ");
    }
}