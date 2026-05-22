class Solution {
    public static void backtrack(List<List<Integer>> finalList , List<Integer> currList , int[] nums){

        if(currList.size() == nums.length) {
              finalList.add(new ArrayList<>(currList));
              return;
        }
        else{
            for(int i = 0; i<nums.length; i++){
                if(currList.contains(nums[i])) continue;
                currList.add(nums[i]);

                backtrack(finalList , currList , nums);
                currList.remove(currList.size()-1);
            }
        }


    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        backtrack(finalList , currList , nums);
        return finalList;
    }
}
