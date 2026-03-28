class Solution {
    public int numSub(String s) {
        int n= s.length();

        int count = 0;
        int max = 0;

        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '1'){
                count++;
            }else{
                count = 0;
            }

            max =( max + count)% 1000000007;

        }

           
        return max ;
    }
}
