class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right =0;

        int minSize = Integer.MAX_VALUE;
        int sum = 0; 
        while(right < n){
            sum+=nums[right];

            while(sum >=target){
               int size = right-left+1;
               minSize = Math.min(minSize , size);
               sum-=nums[left];
               left++;
            }

            right++;
        }

           if(minSize == Integer.MAX_VALUE)   return 0;
        return minSize;

    }
}
