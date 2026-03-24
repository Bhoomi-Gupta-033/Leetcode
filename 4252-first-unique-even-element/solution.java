class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;

        LinkedHashMap<Integer , Integer> freq = new LinkedHashMap<>();
        
        

        for(int i = 0; i<n;i++){
            freq.put(nums[i] , freq.getOrDefault(nums[i] , 0) +1);
            
        }

        for(int key : freq.keySet()){
            if(key%2 == 0){
               if(freq.get(key) == 1){
                return key;
               }
            }
            
        }


            return -1;
    }
}
