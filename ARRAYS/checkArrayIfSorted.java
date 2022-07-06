package ARRAYS;

public class checkArrayIfSorted {

    // grepper check if array is sorted java
    public static boolean checkArraySorted(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--)
            if (arr[i] < arr[i - 1])
                return false;
        return true;
    }
    // end grepper

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(checkArraySorted(arr));
    }
}
