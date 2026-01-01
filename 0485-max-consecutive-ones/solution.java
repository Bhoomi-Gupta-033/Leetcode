class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0 ; i<nums.length; i++){
            int n = nums[i];

            if(n ==1){
                count++;
            }
            else{
                count = 0;
            }

            if(count >max){
                max = count;
            }
        }
        return max;
    }
}
