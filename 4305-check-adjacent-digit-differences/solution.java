class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
       char[] ch = s.toCharArray();
       for(int i =0; i<ch.length-1; i++){
        int c1 = ch[i]-'0';
        int c2 = ch[i+1]-'0';
        if(Math.abs(c1-c2) > 2) return false;
       } 

       return true;
    }
}
