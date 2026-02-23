class Solution {
    public static boolean checkPrime(int n){
        if(n <2) return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }


    public int diagonalPrime(int[][] nums) {
         
         int row = nums.length;
         int n = row;
         int max = Integer.MIN_VALUE;
         for(int i = 0; i<row; i++){
            int x = nums[i][i];

            if(checkPrime(x) == true){
                max = Math.max(x, max);
            }
         }

         for(int i = 0; i<row; i++){
            int x = nums[i][n-i-1];

            if(checkPrime(x) == true){
                max = Math.max(x, max);
            }
         }

         if(max == Integer.MIN_VALUE){
            return 0;
         }
         
         return max;
    }
}
