class Solution {
    public int findShortestSubArray(int[] nums) {
         Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();

        int degree = 0;
        int minLength = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);

            if (count.get(nums[i]) > degree) {
                degree = count.get(nums[i]);
                minLength = i - first.get(nums[i]) + 1;
            } else if (count.get(nums[i]) == degree) {
                minLength = Math.min(minLength, i - first.get(nums[i]) + 1);
            }
        }

        return minLength;
    }
}
