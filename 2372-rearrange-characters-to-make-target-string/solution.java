class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> word = new HashMap<>();
        HashMap<Character, Integer> targetMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            word.put(c, word.getOrDefault(c, 0) + 1);
        }

        for (char c : target.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        int count = Integer.MAX_VALUE;

        for (char c : targetMap.keySet()) {

            if (!word.containsKey(c)) {
                return 0;
            }

            count = Math.min(
                    count,
                    word.get(c) / targetMap.get(c));
        }

        return count;
    }
}
