class Solution {
    public int maxProfit(int[] prices) {
         int n = prices.length;

         int buy = prices[0];
         int maxProfit = 0;

         for(int i = 0; i < n ; i++){
            int profit = 0;
            if(prices[i] < buy){
                buy = prices[i];
            }else{
                profit = prices[i] - buy;
            }
             
             maxProfit = Math.max(profit , maxProfit);

         }

         return maxProfit;
    }
}
