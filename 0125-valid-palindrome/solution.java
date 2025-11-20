class Solution {
    public boolean isPalindrome(String s) {
      String ns = s.toLowerCase();
      String res = "";

      for(int i = 0 ; i<ns.length() ; i++){
         char ch = ns.charAt(i);
         if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
                       res = res + ch;
         }
      }
      
      String rev = "";

      for(int i = res.length()-1 ; i>=0 ;i--){
                rev = rev  + res.charAt(i);
      }
      return (rev.equals(res));
    }
}
