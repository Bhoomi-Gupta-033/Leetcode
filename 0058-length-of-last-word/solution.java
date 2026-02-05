class Solution {
    public int lengthOfLastWord(String s) {
       String str = s.trim();
        int len = str.length();

        int index = len-1;
        int count = 0;
        
            while( index >= 0 && str.charAt(index) != ' '){
            count++;
            index--;
          }
        

        return count;
    }
}
