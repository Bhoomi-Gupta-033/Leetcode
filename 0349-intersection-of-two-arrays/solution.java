class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
       ArrayList<Integer> arrlist = new ArrayList<>();
       int count= 0;
        for(int i=0 ; i<nums1.length;i++){
             int a = nums1[i];

             for(int  j=0 ; j<nums2.length; j++){
              int b = nums2[j];
               
               if(a == b){
                if (!arrlist.contains(a)){ 
                    arrlist.add(a);
                    count++;
                }
                    
               }

             }
        }

        int[] arr = new int[count];
        for(int i=0 ; i<arr.length;i++){
             arr[i] = arrlist.get(i);
        }

        return arr;
    }
}
