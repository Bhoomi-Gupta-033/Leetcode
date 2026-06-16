class Solution {
    public int getLucky(String s, int k) {
        Map<Character, Integer> alphabetMap = new HashMap<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetMap.put(ch, ch - 'a' + 1);
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            str.append(alphabetMap.get(ch));
        }

        String digit = str.toString();

        while (k > 0) {
            int sum = 0;

            for (int i = 0; i < digit.length(); i++) {
                sum += digit.charAt(i) - '0';
            }

            digit = String.valueOf(sum);
            k--;
        }

        return Integer.parseInt(digit);
    }
}
