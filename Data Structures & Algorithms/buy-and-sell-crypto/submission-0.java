class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int maxP = 0;
        int minP = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minP = Math.min(minP, prices[i]);
            maxP = Math.max(prices[i]-minP, maxP);
        }
        return maxP;
    }
}
