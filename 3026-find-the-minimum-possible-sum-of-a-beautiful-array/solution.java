class Solution {
    public int minimumPossibleSum(int n, int target) {
         long MOD = 1000000007L;

        long m = target / 2;

        long firstPart = Math.min(n, m);

        // sum from 1 to firstPart
        long sum1 = (firstPart * (firstPart + 1)) / 2;

        long remaining = n - firstPart;

        long sum2 = 0;

        if (remaining > 0) {

            long last = target + remaining - 1;

            // arithmetic progression sum
            sum2 = (remaining * (target + last)) / 2;
        }

        long ans = (sum1 + sum2) % MOD;

        return (int) ans;
    }
}
