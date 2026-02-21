class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int leftSum = 0;
        int rightSum = 0;       
        
        for(int i =0; i<n;i++){
            leftSum = leftSum + mat[i][i];
            rightSum = rightSum + mat[i][n-i-1];
        }
        int ans = 0;       
        if(n%2 != 0){
            int mid = (n/2);
            ans = leftSum + rightSum - mat[mid][mid];
        }else{
            ans = leftSum + rightSum;
        }
         
         


        return ans;
    }
}
