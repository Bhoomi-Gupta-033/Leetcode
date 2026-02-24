class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i< n; i++){
            set.add(nums[i]);
        }

          int maxcount = 0; 
        for(int el : set){
              if(!set.contains(el-1)){
                int current = el;
                int count = 1;

                 while(set.contains(current +1)){
                    current++;
                    count++;
                 }

                 maxcount = Math.max(count, maxcount);
              }
        }

        return maxcount;
    }
}
