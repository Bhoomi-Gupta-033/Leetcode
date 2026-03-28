class Solution {
    public String largestEven(String s) {
        // String ans = "";
        int n  = s.length();

        for(int i=n-1; i>=0; i--){
         int a = s.charAt(i) - '0';

         if(a%2 != 0){
            s = s.substring(0 , i);
         }else{
            break;
         }
        }

        return s;
    }
}
