class Solution {
    public boolean checkOnesSegment(String s) {
          int count = 0;

        for(int i = 0; i < s.length(); i++) {

            // start of a new segment
            if(s.charAt(i) == '1') {

                count++;

                // skip current segment
                while(i < s.length() && s.charAt(i) == '1') {
                    i++;
                }
            }
        }

        return count <= 1;
    }
}
