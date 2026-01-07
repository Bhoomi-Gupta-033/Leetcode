class Solution {
    public boolean rotateString(String s, String goal) {
           if(s.length() != goal.length()){
            return false;
           }
           else{
            String res = goal + goal;
           return res.contains(s); 
           }
    }

   
}
