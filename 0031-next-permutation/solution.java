class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;

        int pivotIndex = 0;
        int pivotElement = 0;

        for (int i = n; i > 0; i--) {

            if (nums[i] > nums[i - 1]) {
                pivotIndex = i - 1;
                pivotElement = nums[i - 1];
                break;
            }
        }

        int min = 100;
        int minIndex = 0;
        for (int i = pivotIndex + 1; i <= n; i++) {
            if (nums[i] < min) {
                if (nums[i] > pivotElement) {
                    min = nums[i];
                    minIndex = i;
                }
            }
        }

        int temp = nums[pivotIndex];
        nums[pivotIndex] = nums[minIndex];
        nums[minIndex] = temp;

        for (int i = pivotIndex + 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (nums[j] < nums[i]) {
                    int m = nums[i];
                    nums[i] = nums[j];
                    nums[j] = m;
                }
            }
        }

    }
}
