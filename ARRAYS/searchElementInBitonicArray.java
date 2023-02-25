package ARRAYS;

public class searchElementInBitonicArray {

    public static int mid(int a, int b) {
        return a + (b - a) / 2;
    }

    public static int searchIncreasingOrder(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = mid(l, r);
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static int searchDecreasingOrder(int[] arr, int l, int r, int key) {
        while (l <= r) {
            int mid = mid(l, r);
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static int findBitonicIndex(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = mid(l, r);
            if (mid == arr.length - 1)
                return -1;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                return mid;
            if (arr[mid + 1] > arr[mid] && arr[mid - 1] < arr[mid])
                l = mid + 1;
            if (arr[mid + 1] < arr[mid] && arr[mid - 1] > arr[mid])
                r = mid - 1;
        }
        return -1;
    }

    public static int searchInBitonicArray(int[] arr, int key) {
        int index = findBitonicIndex(arr);
        if (index == -1) {
            System.out.println("This array is not bitonic");
            return -1;
        } else if (key == arr[index])
            return index;
        else {
            int temp = searchDecreasingOrder(arr, index + 1, arr.length - 1, key);
            if (temp != -1)
                return temp;
            else
                return searchIncreasingOrder(arr, 0, index - 1, key);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 7, 15, 32, 47, 50, 23, 12, 9, 5, 3, 1 }, key = 12;
        int ans = searchInBitonicArray(arr, key);
        if (ans == -1)
            System.out.println("The element is not found in this array");
        else
            System.out.println(ans);
    }
}