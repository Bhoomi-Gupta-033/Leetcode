class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            if(nums[0] != 0){
                return 1;
            }
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ;i<nums.length ; i++){
           if(nums[i] != 0){
             if(!set.contains(nums[i])){
                set.add(nums[i]);
            }  
           } 
        }       

         return set.size();
    }
}
