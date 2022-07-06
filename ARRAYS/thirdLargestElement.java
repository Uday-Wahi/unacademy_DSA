package ARRAYS;

public class thirdLargestElement {

    // grepper java third largest element in an array
    public static int thirdlargest(int[] arr) {
        int thirdLargest = 0, secondLargest = 0, largest = 0;
        for (int i : arr) {
            if (i > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = i;
            } else if (secondLargest < largest && i > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = i;
            } else if (thirdLargest < secondLargest && i > thirdLargest)
                thirdLargest = i;
        }
        return thirdLargest;
    }
    // end grepper

    public static void main(String[] args) {
        int[] arr = { 5, 10, 2, 9, 11, 6, 4, 12, 8, 7, 1, 3 };
        System.out.println(thirdlargest(arr));
    }
}
