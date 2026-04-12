class Solution {
    public int maxProfit(int[] prices) {
        int bestBuyPrice = prices[0], bestProfit = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            bestBuyPrice = Math.min(bestBuyPrice, prices[i]);
            bestProfit = Math.max(bestProfit, prices[i] - bestBuyPrice);
        }
        return bestProfit;
    }
}
