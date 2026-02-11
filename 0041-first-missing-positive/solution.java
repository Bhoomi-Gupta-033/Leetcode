class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int n= nums.length;

        Set<Integer> set = new TreeSet<>();
        for(int ele : nums){
            set.add(ele);
        }

        //{5,3,2,1,4} n = 5 return 6 n+1
        for(int i = 1;i<=n+1;i++){

            if(!set.contains(i)) return i;
        }
          
          return 0;

    }
}
