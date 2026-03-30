class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxSub = nums[0] ,  currMax = 0;
        int minSub = nums[0] , currMin = 0;

        for(int i =0; i<nums.length;i++){
            currMax = Math.max(nums[i] , currMax + nums[i]);
            maxSub = Math.max(currMax , maxSub);

            currMin = Math.min(nums[i] , currMin + nums[i]);
            minSub = Math.min(currMin , minSub);

            totalSum+=nums[i];
        }

        if(maxSub< 0) return maxSub;

        return Math.max((totalSum - minSub) , maxSub);
    }
}
