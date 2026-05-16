class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] visited = new boolean[26];

        char ch = 'a';

        for(int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);

            if(c != ' ' && !visited[c - 'a']) {
                map[c - 'a'] = ch;
                visited[c - 'a'] = true;
                ch++;
            }
        }

        String ans = "";

        for(int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if(c == ' ') {
                ans += " ";
            }
            else {
                ans += map[c - 'a'];
            }
        }

        return ans;
    }
}
