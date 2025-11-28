class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
    int dummy= numBottles;
    
       int ans = 0;
       while(numBottles >=numExchange){
         int q = numBottles / numExchange;
         int r = numBottles % numExchange;
         ans = ans + q;
         numBottles = q+r;
       }
       return dummy + ans;
    }
}
