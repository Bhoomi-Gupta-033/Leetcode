class Solution {
    public int[] sortArray(int[] nums) {
         PriorityQueue<Integer> minh = new PriorityQueue<>();
         int[] ans = new int[nums.length];      
         for(int i = 0; i<nums.length; i++){
            minh.offer(nums[i]);
         }
        
        for(int i =0;i<nums.length;i++){
            ans[i] = minh.poll();
        }
        
        return ans;

    }
}
