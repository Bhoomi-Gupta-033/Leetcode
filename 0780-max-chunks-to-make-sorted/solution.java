class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] runningSum = new int[n]; 

         runningSum[0] = arr[0];
        for(int i= 1; i<n; i++){
          runningSum[i] = runningSum[i-1] + arr[i];
        }
        
        int[] precomputedSum = new int[n];
        for(int i=0 ;i<n;i++){
            precomputedSum[i] = (i*(i+1))/2;
        }

        int count= 0;
        for(int i = 0; i<n; i++){
            if(runningSum[i] == precomputedSum[i]) count++;
        }
       
       return count;
    }
}
