class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int max = -1;
       int index = 0;
       for(int i =0; i<arr.length;i++){
         max = Math.max(max , arr[i]);
       }

       for(int i =0; i<arr.length;i++){
         if(arr[i] == max){
            index = i;
         }
       }
       
       return index;

    }
}
