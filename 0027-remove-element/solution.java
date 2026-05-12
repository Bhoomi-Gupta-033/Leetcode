class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int[] arr = new int[n];
         int j = 0;
         int count = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] != val){
                arr[j] = nums[i];
                j++;
            }
            if(nums[i] == val){
                count++;
            }
        }

        for(int i = 0; i<n;i++){
            nums[i] = arr[i];
        } 
        
        return  n-count;
    }
}
