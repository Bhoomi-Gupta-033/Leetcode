class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
       int start = numBottles;
       int total = start;
       while(start >= numExchange){
        int q =  start/numExchange;
       int r =  start%numExchange;
        start =  r + q;
        total+=q;    
       }

       return total;
    }
}
