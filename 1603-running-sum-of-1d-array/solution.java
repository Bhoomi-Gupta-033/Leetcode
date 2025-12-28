class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
       int[] sums =new int[n];

       int sum = 0;
       for(int i=0; i<nums.length ; i++){
        int num = nums[i];
        sum =sum+num;
        sums[i] = sum;
       }
       return sums;
    }
}
