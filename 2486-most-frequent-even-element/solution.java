class Solution {
    public int mostFrequentEven(int[] nums) {
         Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        
        if (freq.isEmpty()) {
            return -1;
        }

        int bestNum = -1;
        int bestFreq = 0;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > bestFreq || (count == bestFreq && num < bestNum)) {
                bestNum = num;
                bestFreq = count;
            }
        }

        return bestNum;
    }
}
