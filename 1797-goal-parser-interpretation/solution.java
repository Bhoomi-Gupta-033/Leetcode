class Solution {
    public String interpret(String command) {
       String s = "";
        for(int i=0; i<command.length();i++){
            char sh = command.charAt(i);
            if(sh == 'G'){
                s = s + "G";
            }
            else if(sh == '('){
                if(command.charAt(i+1) == ')'){
                     s = s + "o";
                }     
                else{
                  s = s + "al";
            }           
            }
            

        }
        return s;
    }
}
