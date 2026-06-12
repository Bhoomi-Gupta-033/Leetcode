class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();  
        return check(str , 0 , str.length()-1);
    }

    public boolean check(String str , int low , int high){
        if(low >= high) return true;
        if(str.charAt(low) != str.charAt(high)) return false;
        
          return check(str , low+1 , high-1);
    }
}
