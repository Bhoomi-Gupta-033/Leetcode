class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<String, String> map1 = new HashMap<>();
        HashMap<String, String> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String c1 = String.valueOf(ch);
            String c2 = words[i];

            if (map1.containsKey(c1) && !map1.get(c1).equals(c2)) {
                return false;
            }

            if (map2.containsKey(c2) && !map2.get(c2).equals(c1)) {
                return false;
            }

            map1.put(c1, c2);
            map2.put(c2, c1);
        }

        return true;
    }
}
