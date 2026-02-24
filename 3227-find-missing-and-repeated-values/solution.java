class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        //coverting  into one-D array
        int n = grid.length;
        int[] arr = new int[n * n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[k] = grid[i][j];
                k++;
            }
        }

        Arrays.sort(arr);
        int[] ans = new int[2];
        //finding duplicate element
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            set.add(arr[i]);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                ans[0] = key;
            }

        }

        for (int i = 1; i <= n*n; i++) {
            if (!map.containsKey(i)) {
                ans[1] = i; // missing
                break;
            }
        }

        //element to be added
        // int start = 1;
        // for (int key : set) {
        //     if (key != start) {
        //         ans[1] = start;
        //     } else {
        //         start++;
        //     }
        // }

        // if (ans[1] == 0) {
        //     ans[1] = n * n;
        // }
     return ans;
    }
}
