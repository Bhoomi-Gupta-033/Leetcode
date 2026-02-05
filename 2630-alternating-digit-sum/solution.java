class Solution {
    public int alternateDigitSum(int n) {

      int digits = 0;
      int sum = 0;
      int dummy = n;       
             while(n !=0){
                digits++;
                n = n/10;   
             }

         while( dummy != 0){
            int rem = dummy%10;
            if(digits%2 == 0){
                sum = sum -rem;
                digits--;
            }else{
                sum = sum + rem;
                digits--;
            }

            dummy = dummy/10;
         }    
             return sum;
    }
}
