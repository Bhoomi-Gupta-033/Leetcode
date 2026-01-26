class Solution {
    public boolean isPerfectSquare(int num) {
       
       long low = 1;
       long high = num;

       if(num == 1){
        return true;
       }

       while( low<high){

        long mid = (low+high)/2;
        long sqrt = mid *mid;
        if(sqrt == num){
            return true;
        }
        else if(sqrt < num){
            low = mid +1;
        }
        else{
            high = mid ;
        }
       }
       return false;
}
}
