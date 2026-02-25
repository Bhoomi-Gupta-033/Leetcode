class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n =  nums1.length;
        int m =  nums2.length;

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i =0; i<n;i++){
            set1.add(nums1[i]);
        }

        for(int i =0; i<m;i++){
            set2.add(nums2[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int count =0;
        for(int i : set1){
            if(set2.contains(i)){
                list.add(i);
                count++;
            }
        }

        int[] ans = new int[count];
        
        int i =0;
        for(int el : list){
            ans[i] = el;
            i++;
        }

        return ans;
    }
}
