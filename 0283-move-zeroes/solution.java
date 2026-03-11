class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        for(int i = 0; i<n; i++){
            zeros(nums);
        }
    }

    public static int[] zeros(int[] nums){
        int n = nums.length;

        for(int i = 0; i<n-1; i++){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

        return nums;
    }
}
