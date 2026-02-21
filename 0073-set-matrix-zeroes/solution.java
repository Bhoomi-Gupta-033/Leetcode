class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
              
          HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                 if(matrix[i][j] == 0){
                rowSet.add(i);
                colSet.add(j);
              }
                
            }
        }
         
         for(int r : rowSet){
              for(int c : colSet){
                for(int i =0; i<row; i++){
                  matrix[i][c] = 0;
                }
                for(int i =0; i<col; i++){
                  matrix[r][i] = 0;
                }
              }
            }


    }
}
