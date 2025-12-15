class Solution {
    public boolean isPerfectSquare(int num) {
        double n = Math.sqrt(num);

         if(n == (int)n){
            return true;
         }
         return false;
}
}
