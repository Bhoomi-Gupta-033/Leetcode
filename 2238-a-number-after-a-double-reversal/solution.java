class Solution {
    public boolean isSameAfterReversals(int num) {
        
        int rev = 0;
        int temp = num;

        while(temp != 0){
           int rem = temp%10;
           rev= rev*10+ rem;
           temp =temp/10;
        }

        temp = rev;
        int rev2 = 0;
        while(temp != 0){
           int rem = temp%10;
           rev2= rev2*10 + rem;
           temp =temp/10;
        }

        temp = num;

        if(num == rev2) return true;

        return false;

    }
}
