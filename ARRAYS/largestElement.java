package ARRAYS;

public class largestElement {

    // grepper largest element in array java
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int i : arr)
            if (i > largest)
                largest = i;
        return largest;
    }
    // end grepper

    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 9, 6, 4, 8, 7, 1, 3 };
        System.out.println(largest(arr));
    }
}