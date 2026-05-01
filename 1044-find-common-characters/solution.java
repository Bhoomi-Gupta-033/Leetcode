class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        for (char c = 'a'; c <= 'z'; c++) {
            int minCount = Integer.MAX_VALUE;

            for (int i = 0; i < words.length; i++) {
                int count = 0;
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) == c) {
                        count++;
                    }
                }
                minCount = Math.min(minCount, count);
            }

            for (int k = 0; k < minCount; k++) {
                result.add(String.valueOf(c));
            }
        }

        return result;
    }
}
