class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> list = new ArrayList<>();

        int tr = 0;
        int br = row-1;
        int lc = 0;
        int rc = col-1;

        while(tr <=br && lc <= rc){
            for(int i=lc; i<=rc; i++){
                list.add(matrix[tr][i]);
            }tr++;
            for(int i=tr; i<=br; i++){
                list.add(matrix[i][rc]);
            } rc--;

            if(tr <=br){
                for(int i=rc; i>=lc; i--){
                list.add(matrix[br][i]);
              } br--;
            }
               

            if(lc <= rc)  {
                for(int i=br; i>=tr; i--){
                list.add(matrix[i][lc]);
            }lc++;
            } 
        }

        return list;
    }
}
