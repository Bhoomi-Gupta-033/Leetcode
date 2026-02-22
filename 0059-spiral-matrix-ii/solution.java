class Solution {
    public int[][] generateMatrix(int n) {
        

        int[][] matrix = new int[n][n];

        int row = n;
        int col = n;

        int tr = 0;
        int br = row-1;
        int lc = 0;
        int rc = col-1;
         
         int el = 1;
        while(tr <=br && lc <= rc){
            for(int i=lc; i<=rc; i++){
                matrix[tr][i]  = el;
                el++;
            }tr++;
            for(int i=tr; i<=br; i++){
                matrix[i][rc] = el;
                el++;
            } rc--;

            if(tr <=br){
                for(int i=rc; i>=lc; i--){
                matrix[br][i] = el;
                el++;
              } br--;
            }
               

            if(lc <= rc) {
                for(int i=br; i>=tr; i--){
                matrix[i][lc] = el;
                el++;
              }lc++;
            } 
        }

        return matrix;
    }
}
