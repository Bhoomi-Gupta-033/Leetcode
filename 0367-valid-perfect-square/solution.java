class Solution {
    public boolean isPerfectSquare(int num) {
       if(num == 1) return true;

       long low = 0;
       long high = num;

       while(low < high){
        long mid = (low+ high)/2;

        if( mid*mid == num){
            return true;
        }
        else if( mid * mid < num){
            low = mid+1;
        }
        else{
            high = mid;
        }
       }
      return false;
}
}
