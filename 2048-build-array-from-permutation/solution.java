class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        int[] arr = nums;

        for(int i =0; i<n; i++){
            int a = arr[arr[i]];
            ans[i] = a;
        } 

        return ans;
    }
}
