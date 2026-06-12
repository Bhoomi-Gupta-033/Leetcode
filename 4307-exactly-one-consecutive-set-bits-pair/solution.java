class Solution {
    public boolean consecutiveSetBits(int n) {
        // int rem1 = 0;

        // while(n != 0){
        //    if(n%2 ==1){
        //       if(rem1 == 1){
        //          return true;
        //       }
        //       rem1 = 1;
        //    }
        //    n = n/2;
        // }

        // return false;

        String s = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i) == '1' && s.charAt(i+1) == '1') {
                count++;
            }
        }
           
        return count==1;
    }
}
