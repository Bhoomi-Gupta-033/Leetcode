class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max = 0;
        for(int i =0; i<accounts.length; i++){
            int[] arr = accounts[i];
            
            int sum = 0;
            for(int j = 0 ; j<arr.length ; j++){
                int n = arr[j];
                sum = sum + n;
            }
            if(sum >max){
                max = sum;
            }
            
           
        }
        return max;
    }
}
