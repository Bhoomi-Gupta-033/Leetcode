class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k= k%n;

        int[] ans = new int[n];

        int i =0;
        for(int j = n-k;j<n;j++){
            ans[i] = nums[j];
            i++;
        }

        for(int j =0;j<n-k;j++){
            ans[i] = nums[j];
            i++;
        }

        for(int j = 0; j<n; j++){
            nums[j] = ans[j];
        }
  
    }
}
