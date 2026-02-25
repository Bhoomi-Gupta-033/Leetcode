class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashMap<Integer ,Integer> map1 = new HashMap<>();
        HashMap<Integer ,Integer> map2 = new HashMap<>();

        for(int num : nums1){
            map1.put(num , map1.getOrDefault(num , 0) +1);
        }

        for(int num : nums2){
            map2.put(num , map2.getOrDefault(num , 0) +1);
        }
         
         
         ArrayList<Integer> list = new ArrayList<>();
        for(int  key : map1.keySet()){
            int value1 = map1.get(key);
            int value2 = 0;
            if(map2.get(key) != null){
                 value2 = map2.get(key);
            }

            int times = Math.min(value1, value2);

            for(int i = 1; i<=times ; i++){
                list.add(key);
            }
            
        }

        int size = list.size();

        int[] ans = new int[size];

        int k =0;
        for(int num : list){
            ans[k] = num;
            k++;
        }
         
         return ans;
    }
}
