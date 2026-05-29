class Solution {
    public int minElement(int[] nums) {
        int[] arr = new int[nums.length]; 
       for(int i = 0; i<nums.length; i++){
             int a = nums[i];
             int sum= 0;
              while( a != 0){
                  sum += a%10;
                  a /=10;
              } 

              arr[i] = sum;
       }

       Arrays.sort(arr);
       return arr[0];
    }
}
