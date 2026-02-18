class Solution {
    public String reversePrefix(String s, int k) {
         String str = s.substring(0 , k);
     
     String res = "";
     for(int i = str.length()-1; i>=0;i--){
       res = res + str.charAt(i);
     }

     
     String ans = res+ s.substring(k , s.length());
     
        return ans;
    }
}
