class Solution {
    public boolean isPalindrome(String s) {
      
        String ns = s.replaceAll("[^a-zA-Z0-9]" , "");
        ns=ns.toLowerCase();

        int low = 0;
        int high = ns.length()-1;

        while(low < high){
           if(ns.charAt(low) != ns.charAt(high)){
              return false;
           }else{
            low++;
            high--;
           }
        }

        return true;
    }
}
