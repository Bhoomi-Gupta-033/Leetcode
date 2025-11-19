class Solution {
    public int minLengthAfterRemovals(String s) {
        String  str = s.toLowerCase();
        int countA = 0;
        int countB = 0;
        for(int i=0 ; i<str.length(); i++){
     if(str.charAt(i) == 'a'){
         countA = countA + 1; 
    }
    else if(str.charAt(i) == 'b'){
         countB= countB + 1; 
    }
        }

        return Math.abs(countA - countB);

    
        
    }
}
