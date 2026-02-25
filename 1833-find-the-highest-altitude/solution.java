class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
         
         int[] ans = new int[n+1];
         int sum =0;
          int k = 1;
        for(int i =0;i<n; i++){
            sum = sum + gain[i];
            ans[i] = sum;
        }

        Arrays.sort(ans);

        return ans[n];
    }
}
