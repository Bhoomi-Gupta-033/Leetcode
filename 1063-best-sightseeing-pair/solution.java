class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int bestLeft = values[0] + 0;
        int result = 0;

        for (int j = 1; j < values.length; j++) {
            
            result = Math.max(result, bestLeft + values[j] - j);

           
            bestLeft = Math.max(bestLeft, values[j] + j);
        }

        return result;
    }
}
