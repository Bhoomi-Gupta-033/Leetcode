class Solution {
    public int longestConsecutive(int[] nums) {
         int n = nums.length;
if(n == 0) return 0;

HashSet<Integer> set = new HashSet<>();

for(int i = 0; i < nums.length; i++){
    set.add(nums[i]);
}

int maxCount = 0;

for(int num : set){

    if(!set.contains(num - 1)){   // starting point

        int current = num;
        int count = 1;

        while(set.contains(current + 1)){
            current++;
            count++;
        }

        maxCount = Math.max(maxCount, count);
    }
}

return maxCount;

    }
}
