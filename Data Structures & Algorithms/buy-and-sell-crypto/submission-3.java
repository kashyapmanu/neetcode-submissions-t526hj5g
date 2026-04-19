class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = prices[0];
        int sellPrice = 0;
        for (int i = 1; i < prices.length; i++) {
            sellPrice = prices[i];
            maxProfit = Math.max(maxProfit, sellPrice - buyPrice);
            buyPrice = Math.min(buyPrice, prices[i]);
        }
        return maxProfit;
    }
}
