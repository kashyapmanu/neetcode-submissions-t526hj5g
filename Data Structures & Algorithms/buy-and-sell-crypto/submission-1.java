class Solution {
    public int maxProfit(int[] prices) {
        int bestBuyPrice = prices[0], bestProfit = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            bestProfit = Math.max(bestProfit, prices[i] - bestBuyPrice);
            bestBuyPrice = Math.min(bestBuyPrice, prices[i]);
        }
        return bestProfit;
    }
}
