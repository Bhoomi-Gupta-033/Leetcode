class Solution {
    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        // int check[][] = new int[n][n]; 
        List<List<String>> li = new ArrayList<>();
        solve(board, 0,  li);

        return li;
    }

    public static void solve(int[][] board, int sc, List<List<String>> li) {

        int n = board.length;
        if (sc == n) {
            List<String> temp = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < n; j++) {
                    sb.append(board[i][j] == 1 ? 'Q' : '.');
                }

                temp.add(sb.toString());
            }

            li.add(temp);
            return;
        }

        for (int sr = 0; sr < n; sr++) {
            if (isValid(board, sr, sc)) {
                board[sr][sc] = 1;
                solve(board, sc + 1, li);
                board[sr][sc] = 0;
            }
        }

    }

    public static boolean isValid(int[][] board, int row, int col) {

        int x = row;
        int y = col;

        // left row
        while (y >= 0) {
            if (board[x][y] == 1)
                return false;
            y--;
        }

        // upper-left diagonal
        x = row;
        y = col;

        while (x >= 0 && y >= 0) {
            if (board[x][y] == 1)
                return false;
            x--;
            y--;
        }

        // lower-left diagonal
        x = row;
        y = col;

        while (x < board.length && y >= 0) {
            if (board[x][y] == 1)
                return false;
            x++;
            y--;
        }

        return true;
    }
}
