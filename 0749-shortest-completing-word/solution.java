class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
         HashMap<Character, Integer> need = new HashMap<>();

        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                need.put(ch, need.getOrDefault(ch, 0) + 1);
            }
        }

        String ans = "";

        for (String word : words) {
            HashMap<Character, Integer> freq = new HashMap<>();

            for (char ch : word.toCharArray()) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            boolean valid = true;

            for (char ch : need.keySet()) {
                if (freq.getOrDefault(ch, 0) < need.get(ch)) {
                    valid = false;
                    break;
                }
            }

            if (valid && (ans.equals("") || word.length() < ans.length())) {
                ans = word;
            }
        }

        return ans;
    }
}
