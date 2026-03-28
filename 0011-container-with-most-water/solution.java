class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
       int low = 0;
       int high = n-1;

       int max = 0;

       while(low <high){
        int water = 0;
        if(height[low] < height[high]){
            water+=height[low] *(high - low);
            low++;
        }else{
            water+=height[high] *(high - low);
            high--;
        }
         max = Math.max(water , max);
       }
         
         return max;
    }
}
