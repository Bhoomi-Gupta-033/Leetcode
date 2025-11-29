class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        int max = 0;
        int count = 0;
        for(int i =0 ;i<nums.length;i++){
            int n = nums[i];
            sum = sum +n;
            if(n>max){
                max =n;
            }
        }
        //System.out.println(sum);
        //System.out.println(max);

        if(sum<k){
          //System.out.println(sum);
          return sum;
        }
        else if (sum %k == 0){
           //System.out.println(0);
           return 0;
        }
        else{
            while(sum%k !=0){
              count++;
              sum = sum -max;
              max= max -1;
              sum = sum +max;
            }
            //System.out.println(count);
            return count;
        }
    }
}
