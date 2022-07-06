package ARRAYS;

public class secondLargestElement {

    // grepper java second largest element in an array
    static int secondlargest(int[] arr) {
        int secondLargest = 0, largest = 0;
        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (secondLargest < largest && i > secondLargest)
                secondLargest = i;
        }
        return secondLargest;
    }
    // end grepper

    public static void main(String[] args) {
        int[] arr = { 5, 10, 2, 9, 6, 4, 8, 7, 1, 3 };
        System.out.println(secondlargest(arr));
    }
}
