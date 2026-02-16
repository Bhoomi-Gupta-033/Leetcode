class Solution {
    public int pivotIndex(int[] nums) {
       int n = nums.length;
       int[] pre = new int[n];
       int[] suf = new int[n];

        int preSum = 0;
          for(int i =0; i<n; i++){
            preSum = preSum + nums[i];
            pre[i] = preSum;
          }

          int sufSum = 0;
          for(int i =n-1; i>=0; i--){
            sufSum = sufSum + nums[i];
            suf[i] = sufSum;
          }

          for(int i =0 ; i< n; i++){
            if(pre[i] == suf[i]){
                return i;
            }
          }

        return -1;
    }
}
