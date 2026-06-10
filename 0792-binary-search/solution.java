class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        return binary(nums , 0 , n-1 , target);
    }

    public int binary(int[] nums , int low , int high , int target){
        if(nums[(low+high)/2] == target) return (low+high)/2;
        if(low > high) return -1;
         if(nums[(low+high)/2] > target) {
           return binary(nums , low , (low+high)/2 -1 , target);
         }
         if(nums[(low+high)/2] < target) {
           return binary(nums , (low+high)/2 +1 , high , target);
         }

        return -1;
    }
}
