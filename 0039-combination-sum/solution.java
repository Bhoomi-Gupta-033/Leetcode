class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        backtrack(finalList , currList , candidates , 0 ,0 , target);
        return finalList;
    } 
    public static void backtrack(List<List<Integer>> finalList , List<Integer> currList , int[] nums , int start , int sum , int target){

          if(sum == target){
            finalList.add(new ArrayList<>(currList));
          }

        for (int i = start; i < nums.length; i++) {
            if(sum < target){
            currList.add(nums[i]);
            backtrack(finalList, currList, nums, i , sum + nums[i] ,     target);
            currList.remove(currList.size() - 1);
            }   
        }
 }
}
