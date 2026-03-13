class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        
        double max= 0;
        
         double sum =0;
        for(int i =0; i<k; i++){
            sum+=nums[i];
        }
        double avg = sum/k;
        max = avg;
        for(int i=k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];

             avg = sum /k;
             max= Math.max(max , avg);
        }

        return max;
    }
}
