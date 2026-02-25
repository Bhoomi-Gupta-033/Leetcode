class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int n = nums.length;
        
        int count =0;
        for(int i=0; i<n; i++){
            int a = nums[i];

            for(int j =i+1; j<n ;j++){
              int b = nums[j];
              if(nums[i] == nums[j]){
                 count++;
              }
            }
        }

        return count;
    }
}
