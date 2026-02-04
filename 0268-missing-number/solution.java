class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        } 

         int n = nums.length;
         int sumOfn =( n * (n+1))/2;

         return sumOfn - sum;
        
    }
}
