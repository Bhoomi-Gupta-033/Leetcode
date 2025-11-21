class Solution {
    public int numSub(String s) {
        int countA = 0;
        int ans = 0;
        for(int i=0;i<s.length(); i++){
          char ch = s.charAt(i);
           if(ch == '1'){
            countA = countA + 1;
           }
           else{
            countA = 0;
           }
           ans = (ans + countA) % 1000000007;
  }
   return ans;
     
    }
}
