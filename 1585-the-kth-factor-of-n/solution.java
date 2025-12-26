class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
    for(int  i =1; i<=n ; i++){
        if(n%i == 0){
           count++;
        }      
    }

    int[] arr = new int[count];
    int j =0;
    for(int i =1 ; i<=n; i++){
        if(n%i == 0){
            arr[j] = i;
            j++;
        }
    }
if(arr.length >=k ){
    return arr[k-1];
}
   return -1; 

} 
}  

