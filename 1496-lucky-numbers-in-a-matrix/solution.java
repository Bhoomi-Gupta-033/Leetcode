class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<row; i++){
            for( int j =0; j<col; j++){
                int rowMin = 0;
                int colMax = matrix[i][j];

                for(int k=0 ; k<row; k++){
                     int b = matrix[k][j];
                     if(b > rowMin){
                        rowMin = b;
                     }
                }

                for(int k=0 ; k<col; k++){
                     int b = matrix[i][k];
                     if(b < colMax){
                        colMax = b;
                     }
                }

                if(rowMin == colMax){
                  list.add(rowMin);
                }

            }
        }

        return list;
    }
}
