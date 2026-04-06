class Solution {
    public boolean judgeCircle(String moves) {
        int countR = 0;
        int countL = 0;

        int countU = 0;
        int countD = 0;

        for(int i =0 ;i<moves.length(); i++){
            char ch = moves.charAt(i);

            if(ch == 'L') {
                countL++;
            }else if(ch == 'R'){
              countR++;
            }else if(ch == 'U'){
               countU++; 
            }else if(ch == 'D'){
                countD++;
            }
        
        }

        if(countL == countR && countU == countD){
            return true;
        }

        return false;
    }
}
