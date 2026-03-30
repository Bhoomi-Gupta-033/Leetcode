class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int left = 0;
        int right = left + k - 1;
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }

        while (right < n) {
            int avg = sum / k;
            if (avg >= threshold) {
                count++;
            }
            sum -= arr[left];
            if (right < n-1) { 
                sum += arr[right+1];
            }

            left++;
            right++;
        }

        return count;
    }
}
