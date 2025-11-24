class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        int sum =0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            int num = ch - '0';
            System.out.println(num);
            if(i%2 != 0){
                 num = -num;
                 sum = sum + num;
            }
            else{
              sum = sum +num;
            }
        }
       return sum;
    }
}
