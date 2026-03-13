class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int n = nums.length;
        int bit = 0;
        for(int i =0; i<n; i++){
           if(nums[i]%2 == 0){
             bit = bit | nums[i];
           }
        }

        return bit;
    }
}
