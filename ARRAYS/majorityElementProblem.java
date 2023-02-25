package ARRAYS;

public class majorityElementProblem {

    public static int majorityElement(int arr[]) {
        int majIndex = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majIndex = i;
                count = 1;
            }
            if (arr[majIndex] == arr[i])
                count++;
            else
                count--;
        }
        return arr[majIndex];
    }

    public static boolean isMajority(int[] arr, int cand) {
        int count = 0;
        for (int e : arr)
            if (e == cand)
                count++;
        if (count > arr.length / 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2 };
        int cand = majorityElement(arr);
        if (isMajority(arr, cand))
            System.out.println(cand);
        else
            System.out.println("No Majority Element");
    }
}
