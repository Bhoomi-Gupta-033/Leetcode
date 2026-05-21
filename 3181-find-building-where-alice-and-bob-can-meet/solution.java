class Solution {
    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {
      
        int n = heights.length, m = queries.length;
        int[] ans = new int[m];
        Arrays.fill(ans, -1);

        int[][] sortedQ = new int[m][3];
        for (int i = 0; i < m; i++) {
            int a = queries[i][0], b = queries[i][1];
            if (a > b) { int t = a; a = b; b = t; }
            sortedQ[i] = new int[]{a, b, i};
        }
        Arrays.sort(sortedQ, (x, y) -> y[1] - x[1]);

        int[] stk = new int[n];
        int top = -1;
        int j = n - 1;

        for (int qi = 0; qi < m; qi++) {
            int a = sortedQ[qi][0];
            int b = sortedQ[qi][1];
            int origIdx = sortedQ[qi][2];

            if (a == b) { ans[origIdx] = a; continue; }
            if (heights[a] < heights[b]) { ans[origIdx] = b; continue; }

            // b ke baad wale elements stack mein daalo
            while (j > b) {
                while (top >= 0 && heights[stk[top]] <= heights[j]) top--;
                stk[++top] = j;
                j--;
            }

            // Binary search — stack bottom→top: heights decreasing, indexes decreasing
            // Leftmost valid index = rightmost position in stack with height > need
            int need = heights[a];
            int lo = 0, hi = top, res = -1;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (heights[stk[mid]] > need) {
                    res = stk[mid];  // valid — aur right jaao (smaller index)
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            ans[origIdx] = res;
        }
        return ans;
    }
}
