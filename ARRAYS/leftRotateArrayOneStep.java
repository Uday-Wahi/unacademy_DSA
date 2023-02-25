package ARRAYS;

public class leftRotateArrayOneStep {
    public static void leftRotateArrayByOne(int[] arr) {
        int temp = arr[0];
        int size = arr.length - 1;
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        //
        leftRotateArrayByOne(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
