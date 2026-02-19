class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row = matrix.length;
    int col = matrix[0].length;
    
     int[] sin = new int[row*col];
     
     int k =0;
     for(int i =0; i<row;i++){
       for(int j =0; j<col; j++){
         sin[k] = matrix[i][j];
         k++;
       }
     }
     
     int low =0;
     int high = sin.length -1;
     boolean check = false;
     while(low <= high){
       int mid = (low+high)/2;
       
       if(sin[mid] == target){
         check = true;
         break;
       }
       else if(sin[mid] > target){
         high = mid -1;
       }else{
         low = mid+1;
       }
     }
     
    return check;
     
    }
}
