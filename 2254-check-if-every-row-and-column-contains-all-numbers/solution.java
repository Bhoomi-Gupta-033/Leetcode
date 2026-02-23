class Solution {
    public boolean checkValid(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i =0; i<row; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j =0; j < col; j++){
                 if(!list.contains(matrix[i][j])){
                    list.add(matrix[i][j]);
                 }
            }

            if(list.size() != row){
                return false;
            }
        }

        for(int i =0; i<row; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j =0; j < col; j++){
                 if(!list.contains(matrix[j][i])){
                    list.add(matrix[j][i]);
                 }
            }

            if(list.size() != row){
                return false;
            }
        }

         
        
        return true;
    }
}
