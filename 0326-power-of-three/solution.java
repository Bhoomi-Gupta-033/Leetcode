class Solution {
    public boolean isPowerOfThree(int n) {
          
          if(n==0) return false;
          else if(n==1) return true;

          while( n != 1){
            int rem = n%3;

            if( rem != 0 ){
                return false;
            }
            n = n/3;
          }
          return true;
    }
}
