class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        
    int landFirst = calculate(
                landStartTime, landDuration,
                waterStartTime, waterDuration
        );

        int waterFirst = calculate(
                waterStartTime, waterDuration,
                landStartTime, landDuration
        );

        return Math.min(landFirst, waterFirst);
    }

    public int calculate(int[] start1, int[] dur1,
                          int[] start2, int[] dur2) {

        int minEnd = Integer.MAX_VALUE;

        // Earliest finish time among first type of rides
        for (int i = 0; i < start1.length; i++) {
            minEnd = Math.min(minEnd, start1[i] + dur1[i]);
        }

        int ans = Integer.MAX_VALUE;

        // Finish time after taking a ride of second type
        for (int i = 0; i < start2.length; i++) {
            ans = Math.min(ans,
                    Math.max(minEnd, start2[i]) + dur2[i]);
        }

        return ans;
    }
}
