class Solution {
    int count = 0;
    public int totalNQueens(int n) {
     char[][] board = new char[n][n];
     
     for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        board[i][j] = 'X';
      }
     }

     solve(board , 0);
     return count;
    }

    public  void solve(char[][] board , int row){
      if(row == board.length){
            count++;
            return;
      }

      for(int j = 0; j<board.length; j++){
        if(isSafe(board , row , j)){
          board[row][j] = 'Q';
          solve(board , row+1);
          board[row][j] = 'X';
        }
      }
   
    }

    public  boolean isSafe(char[][] board , int row , int col){
      // horizontal
        for(int j = 0 ; j<board.length; j++){
          if(board[row][j] == 'Q') return false;
        }

        //vertical
        for(int i = 0; i<board.length; i++){
          if(board[i][col] == 'Q') return false;
        }

        //north-east 
       int i = row;
       int j = col;

       while(i>=0 && j <board.length){
           if(board[i][j] == 'Q') return false;
           i--;
           j++;
       }

        //north west
        i = row;
        j = col;

       while(i>=0 && j >=0){
           if(board[i][j] == 'Q') return false;
           i--;
           j--;
       }


        //south-west
        i = row;
        j = col;

       while(i<board.length && j>=0){
           if(board[i][j] == 'Q') return false;
           i++;
           j--;
       }


        //south east
        i = row;
        j = col;

       while(i< board.length && j <board.length){
           if(board[i][j] == 'Q') return false;
           i++;
           j++;
       }

       return true;
    }
}
