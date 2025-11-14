class Solution {
    public boolean isPowerOfThree(int n) {

         if(  n ==1){
            return true;
        }
        else if( n == 0){
            return false;
        }
        
        else{

        while(n != 1){
          int rem = n%3;

          if(rem != 0){
            return false;
          }
          n = n/3;
        }
        return true;
        }
    }
}
