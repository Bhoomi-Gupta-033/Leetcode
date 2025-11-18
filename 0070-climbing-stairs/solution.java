class Solution {
    public int climbStairs(int n) {
        int a = 2;
        int b = 3;
               
        if(n ==1 || n==2 || n==3){
            return n;
        }
        else {
            int w =0;
            for(int i = 4; i<=n; i++){
                w = a+b;
                a=b;
                b=w;
            }
            return w;
        }
        
    }
}
