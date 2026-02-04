class Solution {
    public double minimumAverage(int[] nums) {
       Arrays.sort(nums);
        double[] ans = new double[nums.length/2];
       int low = 0;
       int high = nums.length -1;
        int j = 0;
       while(low < high){
        double avg = (nums[low] + nums[high])/2.0;
         ans[j] = avg;
         j++;
         low++;
         high--;
       }
       Arrays.sort(ans);

       return ans[0];

  }
}
