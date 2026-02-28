class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];

        
        for(int i =0; i<n;i++){
            int a= nums1[i];
            int el =-1;
            for(int j = 0; j<nums2.length-1; j++){
                if(nums2[j] == a){
                    for(int k = j+1; k<nums2.length; k++){
                        if(nums2[k] > a){
                           el = nums2[k]; 
                           break;
                        }
                    }
                }
            }

            ans[i] = el;
        }
         
         return ans;
    }
}
