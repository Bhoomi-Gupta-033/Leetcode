class Solution {
    public List<Integer> findMissingElements(int[] nums) {
          Arrays.sort(nums);
        int n = nums.length;
        int min  = nums[0];
        int max = nums[n-1];

       

        ArrayList<Integer> arrayListName = new ArrayList<>();
        int j = 0;
        for(int i = min; i <= max; i++){
                if(nums[j] != i){
                  arrayListName.add(i);
               } else{
                  j++;
               }

        }
          return arrayListName;
    }
}
