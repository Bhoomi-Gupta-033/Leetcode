class Solution {
    public int nextGreaterElement(int n) {
        int second = n;
          int temp = n;
        int count = 0;
         while(  temp != 0){
            int rem = temp%10;
            count++;
            temp = temp/10;
         }
         
         int[] arr = new int[count];
         int a =0;
         while( n != 0){
            int rem = n%10;
             arr[a] = rem;
             a++;
           n =n/10;
         }
         
         int low = 0;
         int high = count-1;
         while(low<high){
           int b = arr[low];
           arr[low] = arr[high];
           arr[high] = b;
           low++;
           high--;
         }
         

      int m = arr.length-1;
      
      int pivotIndex = 0;
      int pivotElement = 0;
      
      for(int i=m; i>0;i--){
        
        if(arr[i] > arr[i-1]){
          pivotIndex = i-1;
          pivotElement = arr[i-1];
          break;
        }
      }
      
      
      int min = 100;
      int minIndex =0;
      for(int i=pivotIndex+1; i<=m; i++){
          if(arr[i] < min){
        if(arr[i] > pivotElement){
        min = arr[i];
        minIndex = i;
          }
        }
      }
      
     
      int tem = arr[pivotIndex];
      arr[pivotIndex] = arr[minIndex];
      arr[minIndex] = tem;
      
      for(int i =0; i<=m; i++){
        System.out.print(arr[i] + " ");
      }
      
      for(int i = pivotIndex+1; i<=m; i++){
        for(int j = i+1; j<=m; j++){
          if(arr[j] < arr[i]){
            int z = arr[i];
            arr[i] = arr[j];
            arr[j] = z;
          }
        }
      }
      
     
      int ans = arr[0];
      for(int i =0; i<m; i++){
        ans = ans * 10 + arr[i+1];
      }
      
      if(ans > second) return ans;

      return -1;
    }
}
