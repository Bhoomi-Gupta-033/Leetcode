class Solution {
    public String tictactoe(int[][] moves) {
          int[] rows = new int[3];
        int[] cols = new int[3];

        int diagonal = 0;
        int antiDiagonal = 0;

        int player = 1; // A = +1, B = -1

        for (int[] move : moves) {

            int row = move[0];
            int col = move[1];

            rows[row] += player;
            cols[col] += player;

            if (row == col) {
                diagonal += player;
            }

            if (row + col == 2) {
                antiDiagonal += player;
            }

            // Check winner
            if (Math.abs(rows[row]) == 3 ||
                Math.abs(cols[col]) == 3 ||
                Math.abs(diagonal) == 3 ||
                Math.abs(antiDiagonal) == 3) {

                return player == 1 ? "A" : "B";
            }

            player *= -1;
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}
