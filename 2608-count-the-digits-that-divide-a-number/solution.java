class Solution {
    public int countDigits(int num) {
        int dummy = num;
        int count = 0;
        while(dummy != 0){
            int rem = dummy%10;
            if(num%rem == 0){
                count =  count+1;
            }
            dummy =dummy/10;
        }
        return count;
    }
}
