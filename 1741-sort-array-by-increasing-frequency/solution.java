class Solution {
    public int[] frequencySort(int[] nums) {
    
        // Step 1: Build frequency hashmap
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort keys by (freq ascending, value descending)
        List<Integer> keys = new ArrayList<>(freq.keySet());
        Collections.sort(keys, (a, b) -> {
            if (freq.get(a).equals(freq.get(b))) {
                return b - a; // same freq → higher value first
            }
            return freq.get(a) - freq.get(b); // lower freq first
        });

        // Step 3: Build result array by inserting each key freq[key] times
        int[] result = new int[nums.length];
        int idx = 0;
        for (int key : keys) {
            int count = freq.get(key);
            for (int i = 0; i < count; i++) {
                result[idx++] = key;
            }
        }

        return result;

    }
}
