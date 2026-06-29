class Solution {
    public long bowlSubarrays(int[] nums) {
         long ans = 0;
        Stack<Integer> st = new Stack<>();

        for (int x : nums) {
            while (!st.isEmpty() && st.peek() < x) {
                st.pop();
                ans++;
            }

            if (!st.isEmpty()) {
                ans++;
            }

            st.push(x);
        }

        // remove adjacent pairs (length must be >= 3)
        return ans - (nums.length - 1);
    }
}
