class Solution {
    public int maxProfit(int[] prices) {
        int costPrice = prices[0];
        int max = 0;

        for(int i =1; i<prices.length; i++){
               
             if(prices[i] < costPrice) {
                 costPrice = prices[i];
             } else{
                int profit = prices[i] - costPrice;
                max  = Math.max(profit , max);
             }

        }

        return max;
    }
}
