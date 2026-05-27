class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int low = 1;
        int high = findMax(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long totalHours = calculateHours(piles, mid);

            if (totalHours <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private int findMax(int[] piles) {

        int max = piles[0];

        for (int bananas : piles) {
            max = Math.max(max, bananas);
        }

        return max;
    }

    private long calculateHours(int[] piles, int speed) {

        long totalHours = 0;

        for (int bananas : piles) {

            totalHours += (bananas + speed - 1) / speed;

        }

        return totalHours;
    }
}
