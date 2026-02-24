class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
           int n = nums.length;
        int s = nums[0];
        int end = nums[n-1];  

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<n;i++){
            set.add(nums[i]);
        } 

        int k = s;

        while( k <= end){
            if(!set.contains(k)){
                list.add(k);
            }
            k++;
        }
          
          return list;
    }
}
