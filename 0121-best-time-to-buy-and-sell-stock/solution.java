class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){
            int profit = 0;
            if(prices[i] < buy){
                 buy = prices[i];
            }
            else{
                profit = prices[i] - buy;
                 
            }
            if(profit > maxProfit){
                maxProfit = profit;
            }
            //System.out.println();
        }
      return maxProfit;
    }
}
