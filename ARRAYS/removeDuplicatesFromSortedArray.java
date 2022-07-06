package ARRAYS;

import java.util.ArrayList;

public class removeDuplicatesFromSortedArray {

    // grepper remove duplicate elements from sorted array java
    public static ArrayList<Integer> removeDuplis(int[] arr) {
        ArrayList<Integer> auxillaryArr = new ArrayList<>();
        int j = 0;
        auxillaryArr.add(arr[0]);
        for (int i : arr)
            if (i != auxillaryArr.get(j))
                auxillaryArr.add(++j, i);
        return auxillaryArr;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 2, 2, 3, 3, 5, 5, 5, 7, 7, 4, 4, 4, 4, 8, 8, 8, 8, 6, 6, 6, 6 };
        for (int i : removeDuplis(arr))
            System.out.print(i + " ");
    }
}
