class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        Stack<Character> st = new Stack<>();
          
         for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('){
                if(st.size() > 0){
                    res = res + ch;
                }
                st.push(ch);
            }

            else if(ch == ')'){
                if(st.size() > 1){
                    res = res +ch;
                }
                st.pop();
            }


         } 

         return res;

    }
}
