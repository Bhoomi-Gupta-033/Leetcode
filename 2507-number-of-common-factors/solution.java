class Solution {
    public int commonFactors(int a, int b) {
        int c= Math.min(a,b);
        int count = 0;
        for(int i = 1; i<=c ; i++){
            if(a%i == 0 && b %i == 0){
                count = count +1;
            }
        }
        return count;
    }
}
