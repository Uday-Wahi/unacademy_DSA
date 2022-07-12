package ARRAYS;

public class bestTimeToBuySellStocks2 {

    // grepper best time to sell stocks two java
    public static int maxProfit(int[] arr) {
        int maxProfit = 0;
        int i = 0;
        while (i != arr.length - 1) {
            if (arr[i + 1] > arr[i])
                maxProfit += arr[i + 1] - arr[i];
            i++;
        }
        return maxProfit;
    }
    // end grepper

    public static void main(String[] args) {
        int arr[] = { 7, 10, 2, 3, 6, 1 };
        System.out.println(maxProfit(arr));
    }
}
