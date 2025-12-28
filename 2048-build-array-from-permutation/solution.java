class Solution {
    public int[] buildArray(int[] nums) {
       int n = nums.length;
       int[] arr = new int[n];

       for(int i=0; i<n ; i++){
         int num = nums[nums[i]];
         arr[i] = num;
       }
       return arr;
    }
}
