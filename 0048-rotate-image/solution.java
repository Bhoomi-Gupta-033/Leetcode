class Solution {
    public void rotate(int[][] matrix) {

        int row = matrix.length; 
        int col = matrix[0].length;

         int[][] ans = new int[col][row];
        for(int i = 0; i <row ;i++){
            for(int j = 0; j<col; j++){
                 ans[j][i] = matrix[i][j];  
            }
        }

         int[][] ans2 = new int[col][row];
        for(int i = 0; i <row ;i++){
            for(int j = 0; j<col; j++){
                ans2[i][j] = ans[i][row-j-1];
            }
        }
        
        for(int i = 0; i <row ;i++){
            for(int j = 0; j<col; j++){
                 matrix[i][j] = ans2[i][j];
            }
        }


    }
}
