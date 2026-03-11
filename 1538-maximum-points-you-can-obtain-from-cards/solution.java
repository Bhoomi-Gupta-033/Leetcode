class Solution {
    public int maxScore(int[] cardPoints, int k) {
         int n = cardPoints.length;
         int leftSum = 0;  
         for(int i = 0; i<k ; i++){
            leftSum+=cardPoints[i];
         }

         int r = n-1;
         int rightSum = 0;
         int max = leftSum;

         for(int i =k-1; i>=0 ; i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[r];
            r--;

            int sum = leftSum + rightSum;
            max = Math.max(sum , max);
         } 
              
          return max;  
    }
}
