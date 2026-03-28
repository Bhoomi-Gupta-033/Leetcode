class Solution {
    public double minimumAverage(int[] nums) {
        int n = nums.length;
        double[] ans = new double[n/2];

        Arrays.sort(nums);

        int low = 0; 
        int high = n-1;
        int i = 0;
        while(low < high){
          double average =(nums[low] + nums[high])/2.0;
          ans[i] = average;
          i++;
          low++;
          high--;
        }

        Arrays.sort(ans);
        return ans[0];
    }
}
