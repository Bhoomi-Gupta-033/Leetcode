class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            if(map.containsKey(nums[i])){
                int a = map.get(nums[i]);
                int diff = Math.abs(a- i);
                if(diff <= k){
                    return true;
                }
            }

            map.put(nums[i] , i);
        }

        return false;
    }
}
