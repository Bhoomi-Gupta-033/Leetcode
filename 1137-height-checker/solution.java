class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] original = new int[n];

        for(int i =0;i<n; i++){
            original[i] = heights[i];
        }
          Arrays.sort(heights);
          int count = 0;
        for(int i =0; i<n; i++){
            if(original[i] != heights[i]){
                count++;
            }
        }

        return count;

    }
}
