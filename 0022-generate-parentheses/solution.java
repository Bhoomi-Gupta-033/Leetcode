class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<>();
     helper(n , "" , 0 , 0 , ans);
     return ans;

    }

    public void helper(int n , String curr , int low , int right , List<String> ans){

        if(curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }
        if(low < n) helper(n , curr + "(" , low+1 , right , ans);
        if(right < low) helper(n, curr + ")" , low , right + 1 , ans);

        
        

    }
}
