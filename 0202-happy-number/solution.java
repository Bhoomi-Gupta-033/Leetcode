class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
          

          while( n != 1){
             int ans =0;
            while(n !=0){
                int rem = n%10;
                ans = ans + rem*rem;
                n = n/10;
            }
            n= ans;

            if(!set.contains(ans)){
                set.add(ans);
            }else if (set.contains(ans)){
                 return false;
            }
          }
        
        return true;
    }
}
