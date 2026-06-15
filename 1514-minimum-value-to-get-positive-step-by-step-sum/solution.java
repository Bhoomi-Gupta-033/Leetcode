class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;

        while (true) {
            int sum = startValue;
            boolean valid = true;

            for (int num : nums) {
                sum += num;

                if (sum < 1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return startValue;
            }

            startValue++;
        }
    }
}
