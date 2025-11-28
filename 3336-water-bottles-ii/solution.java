class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        if(numBottles <numExchange){
            return numBottles;
        }
        else{
            int BE = numBottles;
          int count = 0;
          while(BE != 0){
            if(BE>=numExchange){
              BE = BE - numExchange;
              count++;
              BE++;
              numExchange = numExchange +1;
            }
            else{
                break;
            }
          }
         return numBottles+count;
        }
    }
}
