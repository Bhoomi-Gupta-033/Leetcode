class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        
        List<List<Integer>> result = new ArrayList<>();

        HashSet<String> set = new HashSet<>();

        // Store queen positions
        for (int[] queen : queens) {
            set.add(queen[0] + "," + queen[1]);
        }

        // 8 directions
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
        };

        // Check every direction
        for (int[] dir : directions) {

            int row = king[0];
            int col = king[1];

            while (true) {

                row += dir[0];
                col += dir[1];

                // Outside board
                if (row < 0 || row >= 8 || col < 0 || col >= 8) {
                    break;
                }

                // Queen found
                if (set.contains(row + "," + col)) {

                    result.add(Arrays.asList(row, col));
                    break;
                }
            }
        }

        return result;
    }
}
