class Solution {
    public int removeDuplicates(int[] nums) {
         int n = nums.length;
        int[] res = new int[n];
        int j = 1;
        int k = 1;
        int count = 1;
        res[0] = nums[0];
        for(int i=0; i<n-1; i++){
            int a =nums[i];
           if(nums[j]>nums[i]){
                res[k] = nums[j];
                count++;
                k++;
            }
            j++;
        }
        
        for(int i=0; i<n; i++){
            nums[i] = res[i];
       }

       return count;
    }
}
