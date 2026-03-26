class Solution {
    public String interpret(String command) {
        String ans = "";

        for(int i=0; i<command.length();i++){
           char ch = command.charAt(i);

           if(ch == 'G'){
              ans+=ch;
           }else if(ch == '(' && command.charAt(i+1) == ')'){
              ans+='o';
           }else if(ch == '(' && command.charAt(i+1) == 'a'){
            ans+="al";
           }
        }

        return ans;
    }
}
