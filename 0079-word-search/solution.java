class Solution {

    public boolean exist(char[][] board, String word) {

        int re = board.length;
        int ce = board[0].length;

        boolean[][] check = new boolean[re][ce];

        for (int i = 0; i < re; i++) {
            for (int j = 0; j < ce; j++) {

                if (backtrack(board, word, i, j, check, 0)) {
                    return true;
                }

            }
        }

        return false;
    }

    public boolean backtrack(char[][] board, String word,
                             int rs, int cs,
                             boolean[][] check,
                             int si) {

        // Word completely matched
        if (si == word.length()) {
            return true;
        }

        // Boundary check
        if (rs < 0 || cs < 0 ||
            rs >= board.length ||
            cs >= board[0].length) {
            return false;
        }

        // Character mismatch or already visited
        if (check[rs][cs] ||
            board[rs][cs] != word.charAt(si)) {
            return false;
        }

        // Mark visited
        check[rs][cs] = true;

        boolean left = backtrack(board, word, rs, cs - 1, check, si + 1);
        boolean right = backtrack(board, word, rs, cs + 1, check, si + 1);
        boolean up = backtrack(board, word, rs - 1, cs, check, si + 1);
        boolean down = backtrack(board, word, rs + 1, cs, check, si + 1);

        // Backtrack
        check[rs][cs] = false;

        return left || right || up || down;
    }
}
