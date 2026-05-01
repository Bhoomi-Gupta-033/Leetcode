class Solution {
    public String[] findWords(String[] words) {
         String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            String row = "";

            if (row1.indexOf(word.charAt(0)) != -1) row = row1;
            else if (row2.indexOf(word.charAt(0)) != -1) row = row2;
            else row = row3;

            boolean valid = true;

            for (int j = 0; j < word.length(); j++) {
                if (row.indexOf(word.charAt(j)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) result.add(words[i]);
        }

        return result.toArray(new String[0]);
    }
}
