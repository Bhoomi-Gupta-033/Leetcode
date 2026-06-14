class Solution {
    public int countQuadruplets(int[] nums) {
       int c = 0;
        int s = nums.length;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                for(int k=j+1;k<s;k++){
                    for(int l=k+1;l<s;l++){
                        if(nums[i]+nums[j]+nums[k] == nums[l]){
                            c++;
                        }
                    }
                }
            }
        }
    return c;
    }
}
