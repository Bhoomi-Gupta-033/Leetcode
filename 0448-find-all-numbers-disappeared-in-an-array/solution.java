class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
           int n = nums.length;
           HashMap<Integer , Integer> map = new HashMap<>();
           ArrayList<Integer> list = new ArrayList<>();        
           for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) +1);
           }

           for(int i =1; i<=n;i++){
            if(map.get(i) == null){
                list.add(i);
            }
           }

           return list;
    }
}
