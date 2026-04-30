class Solution {
    public String makeGood(String s) {
        boolean changed = true;

        while (changed) {

            changed = false;
            StringBuilder temp = new StringBuilder();

            int i = 0;

            while (i < s.length()) {

                if (i < s.length() - 1 &&
                    Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                    
                    // skip both characters
                    i += 2;
                    changed = true;
                } else {
                    temp.append(s.charAt(i));
                    i++;
                }
            }

            s = temp.toString();
        }

        return s;
    }
}
