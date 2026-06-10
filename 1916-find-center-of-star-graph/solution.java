class Solution {
    public int findCenter(int[][] edges) {
       int row = edges.length;
       int col = edges[0].length;
      
       for(int i =0 ;i <row; i++){
         for(int j = 0; j<col; j++){
           int a = edges[i][j];
           for(int k = i+1; k <row; k++){
            if(edges[k][j] == a) return a;
           } 
       }
    }
      return 0;
    }
}
