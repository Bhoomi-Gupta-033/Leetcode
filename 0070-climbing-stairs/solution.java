class Solution {
    public int climbStairs(int n) {
        int a =1;
        int b =2;
        int stair =0;
        if( n==1 || n==2) return n;

        for(int i = 3 ; i<= n ; i++){
            stair = a+b;
            a=b;
            b=stair;
        }

        return stair;
    }
}
