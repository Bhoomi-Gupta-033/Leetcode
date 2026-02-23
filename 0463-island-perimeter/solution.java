class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        int count =0;       
        for(int i=0; i<row; i++){
            for(int j =0; j<col; j++){
                if(grid[i][j] == 1){
                    if(i-1>=0){//top
                        if(grid[i-1][j] == 0){
                            count++;
                        }   
                    }else{
                        count++;
                    }
                    if(i+1 < row){//bottom
                         if(grid[i+1][j] == 0){
                            count++;
                         } 
                    }else{
                        count++;
                    }
                    if(j -1>=0){//left
                        if(grid[i][j-1] == 0){
                            count++;
                        }   
                    }else{
                       count++;
                    }
                    if(j+1 < col){
                        if(grid[i][j+1] == 0){
                            count++;
                        }
                    }else{
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
