class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> textMap = new HashMap<>();
        HashMap<Character, Integer> balloonMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            textMap.put(c, textMap.getOrDefault(c, 0) + 1);
        }

        String target = "balloon";

        for (char c : target.toCharArray()) {
            balloonMap.put(c, balloonMap.getOrDefault(c, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;

        for (char c : balloonMap.keySet()) {

            if (!textMap.containsKey(c)) {
                return 0;
            }

            ans = Math.min(ans,
                    textMap.get(c) / balloonMap.get(c));
        }

        return ans;
    }
}
