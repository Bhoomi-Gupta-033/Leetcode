class Solution {
    public char findTheDifference(String s, String t) {
          int xor = 0 ;

          int n = s.length();
          int m = t.length();

          for(int i =0; i<n ;i++){
            xor = xor ^ s.charAt(i);
            
          }
          for(int i =0; i<m ;i++){
            xor = xor ^ t.charAt(i);
            
          }

          return (char)xor;
    }
}
