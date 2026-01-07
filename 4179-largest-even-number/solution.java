class Solution {
    public String largestEven(String s) {
        int n = s.length();
        for(int i = n-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
           int num = ch - '0';
            if(num %2 == 0){
                return s.substring(0 , i+1);
            }
        }
    return "";
    }
}
