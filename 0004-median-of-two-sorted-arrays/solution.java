class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     
      int n = nums1.length;
        int m = nums2.length;

        int len = m+n;

        int[] res = new int[len];
         
         for(int i = 0; i<n ; i++){
            res[i] = nums1[i];
         }

         int j = 0;
         for(int i = n; i<m+n ; i++){
            if( j < m){
                res[i] = nums2[j];
            j++;
            }
         }
         Arrays.sort(res);

         double ans = 0;
         if(len%2 != 0){
             ans =  res[((len)/2)];
            
         }else{
                ans = (res[(len)/2 -1] + res[(len)/2])/2.0;

         }
         
         return ans;

        
    }

}
