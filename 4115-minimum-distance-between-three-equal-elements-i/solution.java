class Solution {
    public int minimumDistance(int[] nums) {
        
       int min = Integer.MAX_VALUE;
        for(int i =0; i<nums.length ; i++){
            int a = nums[i];
            for(int j =i+1 ; j<nums.length;j++){
                int b = nums[j];
                if(a==b){
                    for(int k =j+1; k<nums.length; k++){
                         int c = nums[k];
                         
                         if(b == c){
                            int ans =  Math.abs(i-j) + Math.abs(j-k)
                             + Math.abs(k-i);

                             min = Math.min(min, ans);
                         }
                    }
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
