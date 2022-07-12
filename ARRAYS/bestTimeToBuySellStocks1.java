package ARRAYS;

public class bestTimeToBuySellStocks1 {

    // grepper best time to sell stocks one java
    public static int maxProfit(int[] prices) {
        int minSoFar = prices[0], max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            max_profit = Math.max(max_profit, profit);
        }
        return max_profit;
    }
    // end grepper

    public static void main(String[] args) {
        // int arr[] = { 1, 4, 3, 2, 7, 1 };
        int arr[] = { 7, 100, 4, 3, 60, 1 };
        System.out.println(maxProfit(arr));
    }
}