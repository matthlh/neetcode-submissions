class Solution {
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        int lowestPrice = prices[0];

        for (int sell : prices) {
            bestProfit = Math.max(bestProfit, sell - lowestPrice);
            lowestPrice = Math.min(lowestPrice, sell);
        }

        return bestProfit;
    }
}
