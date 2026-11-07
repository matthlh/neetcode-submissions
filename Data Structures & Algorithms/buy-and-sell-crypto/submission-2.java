class Solution {
    public int maxProfit(int[] prices) {
        int smallest = prices[0];
        int profit = 0;

        for (int n : prices) {
            smallest = Math.min(smallest, n);
            profit = Math.max(profit, n-smallest);
        }

        return profit;
    }
}
