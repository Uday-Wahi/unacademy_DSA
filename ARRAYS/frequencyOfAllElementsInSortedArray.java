package ARRAYS;

public class frequencyOfAllElementsInSortedArray {

    // grepper print frequency of all elements in sorted array java
    public static void printFrequencyOfAllElementsInSortedArray(int[] arr) {
        int frequencyCount = 0, curElement = arr[0];
        for (int i : arr) {
            if (i == curElement)
                frequencyCount++;
            else if (i != curElement) {
                System.out.println("frequency of element '" + curElement + "' is: " + frequencyCount);
                curElement = i;
                frequencyCount = 1;
            }
        }
        System.out.println("frequency of element '" + curElement + "' is: " + frequencyCount);
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 5, 6, 6, 7, 8, 9, 9, 9, 10, 10 };
        printFrequencyOfAllElementsInSortedArray(arr);
    }
}