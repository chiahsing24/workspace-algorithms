class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        
        int maxProfit = 0;
        int buy = 0;
        int sell = 1;
        while (buy < prices.length && sell < prices.length) {
            int profit = prices[sell] - prices[buy];
            if (profit > 0) {
                maxProfit = Math.max(maxProfit, profit);
                sell++;
            } else {
                buy = sell;
                sell++;
            }                
        }

        return maxProfit <= 0 ? 0 : maxProfit;
    }
}