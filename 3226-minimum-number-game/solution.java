class Solution {
    public int[] numberGame(int[] nums) {
         int n = nums.length;
        int[] ans = new int[n];

        int index = 0;

        while(index < n) {

            // find smallest
            int min1 = Integer.MAX_VALUE;
            int pos1 = -1;

            for(int i = 0; i < n; i++) {
                if(nums[i] < min1) {
                    min1 = nums[i];
                    pos1 = i;
                }
            }

            nums[pos1] = Integer.MAX_VALUE;

            // find second smallest
            int min2 = Integer.MAX_VALUE;
            int pos2 = -1;

            for(int i = 0; i < n; i++) {
                if(nums[i] < min2) {
                    min2 = nums[i];
                    pos2 = i;
                }
            }

            nums[pos2] = Integer.MAX_VALUE;

            // Bob's number first
            ans[index] = min2;
            ans[index + 1] = min1;

            index += 2;
        }

        return ans;
    }
}
