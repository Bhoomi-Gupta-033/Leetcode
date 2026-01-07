class Solution {
    public void sortColors(int[] nums) {
        for(int i = 0 ; i<nums.length ; i++){
            swap(nums);
        }
    }

    public static int[] swap(int[] nums){
        int n = nums.length;
        for(int i =0 ; i<n-1 ; i= i+1){
            int num = nums[i];
            if(num > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
            
        }
        return nums;
    }
    

}
