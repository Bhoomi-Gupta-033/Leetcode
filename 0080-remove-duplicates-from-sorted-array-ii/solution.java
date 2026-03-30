class Solution {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;

        LinkedHashMap<Integer , Integer> map = new LinkedHashMap<>();

        for(int i=0; i<n;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) +1);
        }
         
         int i =0;

        for( int key : map.keySet()){
            if(i < n){
                if(map.get(key) == 1){
              nums[i] = key;
              i++;
            }else if(map.get(key) >= 2){
                nums[i] = key;
                nums[i+1] = key;
                i = i+2;
              }
            }
        }

        return i;
    }
}
