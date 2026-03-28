class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();

          int row = matrix.length;
          int col = matrix[0].length;
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                if(matrix[i][j] == 0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
         
        for(int rowS : rowSet){
            for(int colS : colSet){
                    for(int i =0; i<col; i++){
                        matrix[rowS][i] = 0;
                    }

                    for(int i =0; i<row; i++){
                        matrix[i][colS] = 0;
                    }
            }
        }

        
    }
}
