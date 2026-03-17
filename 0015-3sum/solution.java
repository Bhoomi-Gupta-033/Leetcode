class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int a = nums[j];
                int b = nums[k];

                if ((nums[i] + nums[j] + nums[k]) == 0) {
                    ArrayList<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);

                    list.add(li);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;

                } else if ((nums[i] + nums[j] + nums[k]) < 0) {
                    j++;
                } else {
                    k--;
                }

            }

        }

        return list;

    }
}
