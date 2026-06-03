class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        backtrack(finalList , currList , nums , 0);
        return finalList;
    }
     public static void backtrack(List<List<Integer>> finalList , List<Integer> currList , int[] nums , int start){

          finalList.add(new ArrayList<>(currList));

        for (int i = start; i < nums.length; i++) {
            currList.add(nums[i]);

            backtrack(finalList, currList, nums, i + 1);

            currList.remove(currList.size() - 1);
        
    }
}
}
