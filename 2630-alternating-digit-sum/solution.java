class Solution {
    public int alternateDigitSum(int n) {
       int sum = 0;
    int count = 0;
    int dummy = n;

     while(n != 0){
         count  = count + 1;
         n = n/10;
     }

     while( dummy != 0){
         int rem = dummy%10;
         if(count %2 == 0){
            sum = sum - rem;
            count--;
         }
         else{
            sum = sum + rem;
            count--;
         }
         dummy = dummy/10;
     }
      return (sum);
        
    }
}
