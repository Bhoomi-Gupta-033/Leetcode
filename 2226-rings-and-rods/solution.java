class Solution {
    public int countPoints(String rings) {
         boolean[][] rods = new boolean[10][3]; 
        // 0 -> R, 1 -> G, 2 -> B

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            if (color == 'R') {
                rods[rod][0] = true;
            } else if (color == 'G') {
                rods[rod][1] = true;
            } else { // 'B'
                rods[rod][2] = true;
            }
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (rods[i][0] && rods[i][1] && rods[i][2]) {
                count++;
            }
        }

        return count;
    }
}
