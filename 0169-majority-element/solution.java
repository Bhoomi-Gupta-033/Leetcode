class Solution {
    public int majorityElement(int[] nums) {
      int n = nums.length;
      HashMap<Integer , Integer> map = new HashMap<>();
      for(int i=0; i<nums.length;i++){
          map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
      }
      
      for(int el : map.keySet()){
        
        if(map.get(el) > n/2){
          
          return el;
        }
      }
      
     return 0;
    }
}
