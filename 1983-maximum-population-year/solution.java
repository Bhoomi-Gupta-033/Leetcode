class Solution {
    public int maximumPopulation(int[][] logs) {
         int[] years = new int[101];

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int maxPop = 0;
        int currPop = 0;
        int ans = 1950;

        for (int i = 0; i < 101; i++) {
            currPop += years[i];

            if (currPop > maxPop) {
                maxPop = currPop;
                ans = i + 1950;
            }
        }

        return ans;
    }
}
