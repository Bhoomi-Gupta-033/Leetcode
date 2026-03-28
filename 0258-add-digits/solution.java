class Solution {
    public int addDigits(int num) {
      if(num <=9) return num;

       while(num >9){
             int digit = 0;
        while(num != 0){
            int rem = num%10;
            digit+=rem;
            num/=10;
        }
        if(digit <=9){
            return digit;
        }
        num = digit;

       }

        return 0;
    }
}
