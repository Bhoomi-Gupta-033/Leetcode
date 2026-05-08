class Solution {
    public int[] countOppositeParity(int[] nums) {
        
        int n = nums.length;

        int[] ans = new int[n];

        for(int i = 0; i<n; i++){
            int a = nums[i];
            int count = 0; 
            
            int val = helper( a , count , i , nums);
            ans[i] = val;
            
        } 

        return ans;
    }

    public int helper(int a , int count , int i , int[] nums){
        int n = nums.length;
                if(a%2 == 0){
                for(int j = i+1; j<n;j++){
                    if(nums[j] %2 != 0){
                        count++;
                    }
                }
            }else{
                for(int j = i+1; j<n;j++){
                    if(nums[j] %2 == 0){
                        count++;
                    }
                }
            } 

            return count;
    }
}
