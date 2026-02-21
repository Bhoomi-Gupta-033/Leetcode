class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        int i =0;
        int j = col-1;      
            while(i < row && j>=0){
                    int a = matrix[i][j];

                    if(a == target){
                        return true;
                    }
                    else if(a > target){
                        j--;
                    }else{
                        i++;
                    }
            }

            return false;
        
    }
}
