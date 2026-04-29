class Solution {
    public int chalkReplacer(int[] chalk, int k) {
          long total = 0;

        // Total chalk per round
        for (int value : chalk) {
            total += value;
        }

        // Reduce unnecessary cycles
        k %= total;

        // Find student
        for (int i = 0; i < chalk.length; i++) {

            if (k < chalk[i]) {
                return i;
            }

            k -= chalk[i];
        }

        return 0;
    }
}
