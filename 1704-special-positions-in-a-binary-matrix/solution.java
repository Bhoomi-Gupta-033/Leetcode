class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

         int sp =0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    
                    int rsum = 0;
                    int csum =0;
                    for(int k =0; k<row; k++){
                          rsum = rsum + mat[k][j];

                    }

                    for(int k =0; k<col; k++){
                        csum = csum + mat[i][k];
                    }

                    if(rsum == 1 && csum == 1){
                        sp++;
                    }

                }
            }
        }

        return sp;

    }
}
