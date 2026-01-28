class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double[] avg = new double[n/2];
        int j=0;
         int low =0;
         int high = n-1;

         while(low <high){
            double curr =( nums[low] + nums[high])  / 2.0;
            avg[j] = curr;
            j++;
            low++;
            high--;
         }

         Arrays.sort(avg);
         return avg[0];
}
}
