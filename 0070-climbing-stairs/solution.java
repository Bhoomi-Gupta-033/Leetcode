class Solution {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
               
        if(n ==1 || n==2 ){
            return n;
        }
        else {
            int w =0;
            for(int i = 3; i<=n; i++){
                w = a+b;
                a=b;
                b=w;
            }
            return w;
        }
        
    }
}
