class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
       HashMap<Integer , Integer> map = new HashMap<>();

       for(int i = 0 ;i <n;i++){

        map.put(nums[i] , map.getOrDefault(nums[i] , 0)+ 1);

       }

       int[] ans = new int[2];
       int i =0;
       for(int el : map.keySet()){

        if(map.get(el) == 1){
            ans[i] = el;
            i++;
        }
       }

        return ans;
    }
}
