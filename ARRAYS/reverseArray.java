package ARRAYS;

public class reverseArray {

    // grepper swap two elements of array using bit operator java
    public static void swap(int a[], int i, int j) {
        int temp = a[i] ^ a[j];
        a[i] = temp ^ a[i];
        a[j] = temp ^ a[j];
    }
    // end grepper

    // grepper reverse array using bit operator java
    public static int[] reversearray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }
        return arr;
    }
    // end grepper

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 6, 4, 8 };
        for (int i : reversearray(arr))
            System.out.print(i + " ");
        System.out.println();
    }
}