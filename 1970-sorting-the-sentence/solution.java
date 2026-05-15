class Solution {
    public String sortSentence(String s) {
         String[] words = s.split(" ");
        String ans = "";

        for(int i = 1; i <= words.length; i++) {
            for(int j = 0; j < words.length; j++) {
                char ch = words[j].charAt(words[j].length() - 1);

                if(ch - '0' == i) {
                    ans += words[j].substring(0, words[j].length() - 1) + " ";
                }
            }
        }

        return ans.trim();
    }
}
