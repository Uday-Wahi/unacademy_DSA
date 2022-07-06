package ARRAYS;

public class smallestElement {

    // grepper smallest element in array java
    public static int smallest(int arr[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i < smallest)
                smallest = i;
        }
        return smallest;
    }
    // end grepper

    public static void main(String[] args) {
        int[] arr = { 5, 1, 2, 9, 6, 4, 8, 7, 1, 3 };
        System.out.println(smallest(arr));
    }
}
