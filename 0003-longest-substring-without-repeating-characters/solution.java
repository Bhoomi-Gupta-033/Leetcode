class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l =0;
        int r= 0;
        int max =0;
        int n = s.length();
         HashMap<Character , Integer> map = new HashMap<>();
        while(r < n){
            char ch = s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch) >= l){
                    l = map.get(ch) + 1;
                }
            }

            int len = r-l+1;
            max = Math.max(max , len);
            map.put(ch , r);
            r++;

        }

        return max;
        
     }
}
