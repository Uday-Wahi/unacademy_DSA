package ARRAYS;

public class longestConsecutive_Ones {

    public static int longestConsec1s(int[] arr) {
        int maxLongest = 0, curLongest = 0;
        for (int i : arr) {
            if (i == 1)
                curLongest++;
            else
                curLongest = 0;
            if (curLongest > maxLongest)
                maxLongest = curLongest;
        }
        return maxLongest;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1 };
        System.out.println(longestConsec1s(arr));
    }
}
