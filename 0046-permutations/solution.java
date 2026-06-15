class Solution {
    public static void backtrack(List<List<Integer>> finalList , List<Integer> currList , int[] nums ,  boolean[] check){

       if(currList.size() == nums.length){
          finalList.add(new ArrayList<>(currList));
          return;
       }

       
       for(int i = 0; i<nums.length; i++){
         if(currList.contains(nums[i]) || check[i]== true) continue;
                currList.add(nums[i]);
                check[i] = true;
                backtrack(finalList , currList , nums ,check);
                currList.remove(currList.size()-1);
                check[i] = false;
            }


    

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        backtrack(finalList , currList , nums ,  check);
        return finalList;
    }
}
