class Solution {
    public boolean isAnagram(String s, String t) {
         String ans = "";
    
    if(s.length() == t.length()){
       for(int i =0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j =0 ;j< t.length();j++){
                char sh = t.charAt(j);
                if(ch == sh){
                     ans = ans + sh;
                      t = t.substring(0, j) + t.substring(j + 1);
                     break;
                }
                
            }
        }
        
        return (s.equals(ans));
    }
    else{
      return false;
    }
       
    }
}
