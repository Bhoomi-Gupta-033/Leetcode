class Solution {
    public int countValidSelections(int[] nums) {
        long total = 0;

        for (int num : nums) {
            total += num;
        }

        long leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            long rightSum = total - leftSum - nums[i];

            if (nums[i] == 0 && Math.abs(leftSum - rightSum) <= 1) {
                if (leftSum == rightSum) {
                    count += 2; // both directions work
                } else {
                    count += 1; // only one direction works
                }
            }

            leftSum += nums[i];
        }

        return count;
    }
}
