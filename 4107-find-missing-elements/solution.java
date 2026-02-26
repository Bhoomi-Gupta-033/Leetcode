class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        int s = nums[0];
        int end = nums[n-1];

        for(int i=s; i<=end; i++){
           if(!set.contains(i)){
             list.add(i);
           }
        }

        return list;
    }
}
