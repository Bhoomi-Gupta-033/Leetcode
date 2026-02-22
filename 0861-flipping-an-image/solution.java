class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;

        
        int[][] ans2 = new int[row][col];
         
        for(int i =0; i<row; i++){
            int index = 0;
            for(int j = col-1; j>=0; j--){
                ans2[i][index] = image[i][j];
                index++;
            }
        }
        
        int[][] ans = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int el = ans2[i][j];
                if (el == 0) {
                    ans[i][j] = 1;
                } else {
                    ans[i][j] = 0;
                }

            }
        }

        return ans;
    }
}
