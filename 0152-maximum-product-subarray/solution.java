class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];
        int max = 0;

        for(int i = 0; i<n; i++){
            int a = nums[i];
            max= Math.max(a , max);
        }

        for(int i = 0; i<n; i++){
            int pro = nums[i];
            for(int j = i+1; j<n;j++){
                pro*=nums[j];
                max=  Math.max(pro , max);
            }
        }

        return max;
    }
}
