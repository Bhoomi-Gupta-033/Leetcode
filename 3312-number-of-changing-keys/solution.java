class Solution {
    public int countKeyChanges(String s) {
        int count  = 0;
        String s2 = s.toLowerCase();
        for(int i = 0; i<s2.length()-1; i++){
            if(s2.charAt(i) != s2.charAt(i+1)){
                count = count + 1;
            }
        }
        return count;
    }
}
