class Solution {
    public void sortColors(int[] nums) {
       
       int n = nums.length;
       int[] res = new int[n];
       HashMap<Integer , Integer> map = new HashMap<>();
       
       for(int i =0; i<n;i++){
        map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
       }
       
       int c0 =0;
       int c1 =0;

       for(int el : map.keySet()){
          if(map.get(0) != null){
             c0 = map.get(0);
         }
         if(map.get(1) != null){
            c1 = map.get(1);
         }
       }
 
       for(int i=0;i<c0;i++){
        nums[i] = 0;
       }
       for(int i=c0;i<(c0+c1);i++){
          nums[i] = 1;
       }

       for(int i=(c0+c1);i<n;i++){
          nums[i] = 2;
       }
        
   }

}
