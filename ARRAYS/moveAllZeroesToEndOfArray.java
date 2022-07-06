package ARRAYS;

public class moveAllZeroesToEndOfArray {

    // grepper move all zeros to the end of the array java
    public static void moveAll0sEndInArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 8, 0, 1, 3, 0, 0, 5 };
        moveAll0sEndInArray(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}