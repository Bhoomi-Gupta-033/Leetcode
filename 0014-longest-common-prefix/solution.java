class Solution {
    public String longestCommonPrefix(String[] strs) {
         Arrays.sort(strs);

         int n = strs.length;
         String s1 = strs[0];
         String s2 = strs[n-1];

         int n2 = s1.length();
         int m = s2.length();

         int len = Math.max(n2 , m);
         
         String res = "";
         for(int i =0; i<s1.length(); i++){
            
            if(s1.charAt(i) == s2.charAt(i)){
                res = res + s1.charAt(i);
            }else{
                break;
            }
         }
            

            return res;
    }
}
