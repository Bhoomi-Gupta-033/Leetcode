class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i<n; i++){
            set1.add(nums1[i]);
        }
        for(int i = 0; i<m; i++){
            set2.add(nums2[i]);
        }
         ArrayList<Integer> list = new ArrayList<>();
        for(int el : set1){
            if(set2.contains(el)){
                 list.add(el);
            }
        }
         int size = list.size();
        int[] ans = new int[size];
        int k =0;
        for(int el : list){
           ans[k] = el;
           k++;
        }
       return ans;
         
    }
}
