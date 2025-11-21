class Solution {
    public boolean judgeSquareSum(int c) {
        if(c == 1 || c ==0){
            return true;
        }
       long s = 0;
       long e = (long)Math.sqrt(c);

       while(s<=e){
          long ans = s*s + e*e;
          if(ans == c){
            return true;
          }
          else if(ans > c){
            e= e-1;
          }
          else if(ans < c){
            s =s+1;
          }
       }
         return false;   
    }
}
