class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l = nums.length;
        int[] arr = new int[l];
        int x =0;
        for(int i = 0 ; i<l ; i++){
            if(i%2 ==0){
              arr[i] = nums[x];
              x++;
            }
            
            else{
                arr[i] = nums[n];
                n++;
            }
        }  
       
      return arr;
        
    }
}
