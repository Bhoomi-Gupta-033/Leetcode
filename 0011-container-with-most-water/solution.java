class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length -1;
        int max = 0;
        while(low < high){
            int a = height[low];
            int b = height[high];
            int capacity =  0;
            if(a<b){
                capacity = a * (high - low);
                 low++;
            }else{
                capacity = b * (high - low);
                 high--;
            }

             max = Math.max(max , capacity);
        }

        return max;
    }
}
