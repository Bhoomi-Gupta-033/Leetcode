class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

       int row = mat.length;
       int col = mat[0].length;

       int[][] ans = new int[r][c];

       if(row*col != r*c){
            return mat;
       }  
        
        int[] sin = new int[row*col]; 
         int k =0;
        for(int i=0;i <row;i++){
            for(int j=0; j<col ;j++){
                sin[k] =  mat[i][j]; 
                k++;
            }
        }

         int a =0;
         for(int i =0; i<r;i++){
            for(int j=0; j<c; j++){
                ans[i][j] = sin[a];
                a++;
            }
         }
        
       return ans;
    }
}
