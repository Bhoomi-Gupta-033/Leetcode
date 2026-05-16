class Solution {
    public int countAsterisks(String s) {
         int pipes = 0;
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if(ch == '|') {
                pipes++;
            }

            if(ch == '*' && pipes % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
