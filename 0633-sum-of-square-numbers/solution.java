class Solution {
    public boolean judgeSquareSum(int c) {
        long a =0;
      long b = 0;

      while( a*a <=c - b*b){
        a++;
      }
      for(long i =0; i<=a ;i++){
       long ans = c- i*i;
       double f = Math.pow(ans, 0.5);

       if(f == (int)f){
       return true;
       }
      }
      return false;
}
}
