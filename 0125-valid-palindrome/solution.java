class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.replaceAll("[^a-zA-Z0-9]", ""); 
        int n = str.length();
        int low = 0;
        int high = n-1;
        str = str.toLowerCase();
        while(low <=high){
            if(str.charAt(low) != str.charAt(high)){
                return false;
            }
            low++;
            high--;

        }

        return true;
    }
}
