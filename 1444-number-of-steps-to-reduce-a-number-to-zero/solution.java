class Solution {
    public int numberOfSteps(int num) {
        
        int dummy = num;
        int count= 0;

        while(dummy != 0){
            if(dummy%2 == 0){
            dummy/=2;
        }else{
            dummy-=1;
        }
        count++;
        }

        return count;
    }
}
