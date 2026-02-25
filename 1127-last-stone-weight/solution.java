class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        if( n ==1 ) return stones[0];
          
          Arrays.sort(stones);

          for(int i = n-1; i>0; i--){
             if(stones[i] == stones[i-1]){
                stones[i-1] = 0; 
             }else{
                int el = stones[i] - stones[i-1];
                stones[i-1] = el;
             }
             Arrays.sort(stones);
          }

          int ans = Integer.MAX_VALUE;

          for(int i = 0; i<n;i++){
             
                 ans = Math.min(stones[i] , ans);
              
          }
            
            return ans;
    }
}
