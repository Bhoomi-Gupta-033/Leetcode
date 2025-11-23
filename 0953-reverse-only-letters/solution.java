class Solution {
    public String reverseOnlyLetters(String s) {
        String rev = "";
      int n = s.length()-1;
       
      for (int i = n; i >=0 ; i--) {
          char ch = s.charAt(i);
          if(((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))){
             rev = rev + ch;
          }
      }


        int idx =0;
        String res = "";
      for(int i = 0; i<s.length() ;i++){
        char ch = s.charAt(i);
        if(!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))){
           res = res + ch;
        }
        else{
          res = res + rev.charAt(idx);
          idx = idx +1;
        }
      }
      return res;
    }
}
