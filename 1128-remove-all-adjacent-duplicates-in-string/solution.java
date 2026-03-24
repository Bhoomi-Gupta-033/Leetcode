class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> dummy = new Stack<>();
        

        for(int i= 0; i<n;i++){
              
            if(!dummy.isEmpty() == true && dummy.peek() == s.charAt(i)){
                dummy.pop();
            }else{
                dummy.push(s.charAt(i));
            }
               }
            
        

       String str = "";

       while(!dummy.isEmpty()){
         str = str + dummy.pop();
       }

       String ans = "";

       for(int i = str.length()-1; i>=0 ; i--){
        ans = ans + str.charAt(i);
       }

       return ans;
    }
}
