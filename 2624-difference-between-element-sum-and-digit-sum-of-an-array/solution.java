class Solution {
    public int differenceOfSum(int[] nums) {
        int elmSum = 0;
        int digitSum = 0;
        for(int i =0; i <nums.length ; i++){
            int n = nums[i];
            elmSum = elmSum + n;
            int sum = 0;
            if(n >9){
                while(n != 0){
                int rem = n %10;
                sum = sum + rem;
               n = n/10;
            }
            }
            else{
                sum = sum +n;
            }
            
            digitSum = digitSum + sum;
        }

        return Math.abs(elmSum - digitSum);
    }
}
