/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;**/

     class Solution {
   int sum = 0;
   public int Digit(TreeNode root , int ans){

       if(root == null) return 0;
       if(root.left == null && root.right == null){
            sum+=ans*10+root.val;
        }
       
       int left = Digit(root.left , ans*10+root.val);
       int right = Digit(root.right , ans*10+root.val);

       return sum;
   }

    public int sumNumbers(TreeNode root) {
         return Digit(root , 0);
           
    }
     }
