class Solution {
    public boolean isArraySpecial(int[] nums) {
       int n  = nums.length;

       for(int i =0 ; i<n-1 ; i++){
        int a = nums[i];
        int b = nums[i+1];
         if( a%2 == 0 && b%2 == 0 || 
             a%2 != 0 && b%2 != 0){
                return false;
             }
       }
       return true;
    }
}
