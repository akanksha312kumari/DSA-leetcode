class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i=0; i<prices.length; i++){
            int sellPrice = prices[i];

            if (buyPrice < sellPrice){
                int profit = sellPrice - buyPrice;

                maxProfit = Math.max(profit, maxProfit);
            }

            if (buyPrice > sellPrice){
                buyPrice = sellPrice;
            }
        }

        return maxProfit;

    }
}