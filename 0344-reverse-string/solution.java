class Solution {
    public void reverseString(char[] s) {
       int n = s.length;
       int low = 0;
       int high = n-1;
       while(low<high){
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        low++;
        high--;
       }

       for(int i =0 ; i<n ; i++){
         System.out.print(s[i]);
       }
    }
}
