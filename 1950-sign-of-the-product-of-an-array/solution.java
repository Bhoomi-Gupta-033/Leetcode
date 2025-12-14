class Solution {
    public int arraySign(int[] nums) {
        //int signFunc(product) =1;
        
        int countN =0;
        int count = 0;
         for(int i=0; i<nums.length; i++){
            if(nums[i] <0){
                countN++;
            }
            else if(nums[i] == 0){
                count++;
            }
         }
         if(count>=1){
            return 0;
         }
         else if(countN%2 == 0){
            return 1;
         }
         else{
            return -1;
         }
    }
}


