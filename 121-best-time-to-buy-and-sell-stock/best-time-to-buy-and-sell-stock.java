class Solution {
    public int maxProfit(int[] prices) {
        //buy -> least amt
        //sell -> highest amt after least amt
        //profit **
        int bestBuy = 0;
        int bestProfit = 0;
        for(int r = 1; r < prices.length; r++){
            if(bestProfit < prices[r] - prices[bestBuy]){
                bestProfit = prices[r] - prices[bestBuy];
            }
            if(prices[bestBuy] > prices[r]) bestBuy = r;
        }

        return bestProfit;
    }
}