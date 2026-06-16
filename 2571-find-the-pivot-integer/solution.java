class Solution {
    public int pivotInteger(int n) {
        int[] nums = new int[n];
        Arrays.setAll(nums, i -> i + 1);  


        int[] runningSum1 = new int[n]; 
        int[] runningSum2 = new int[n]; 

        runningSum1[0] = nums[0];
        runningSum2[n-1] = nums[n-1];

        for(int i = 1;i<n;i++){
            runningSum1[i] = runningSum1[i-1] + nums[i];
        }

        for(int i =n-2;i>=0;i--){
            runningSum2[i] = runningSum2[i+1] + nums[i];
        }
          
        for(int i =0; i<n;i++){
            if(runningSum1[i] == runningSum2[i]) return i+1;
        }  
         
         return -1;
    }
}
