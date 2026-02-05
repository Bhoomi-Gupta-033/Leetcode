class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int min = nums[0];
        
         for(int i = min ; i>0 ; i--){

            if(max%i == 0 && min %i == 0){
                  return i;
            }
         }

         return 1;
     }
}
