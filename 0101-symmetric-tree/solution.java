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
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static boolean divideTree(TreeNode p  , TreeNode q){
          if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        boolean left = divideTree(p.left , q.right);
         boolean right = divideTree(p.right , q.left);

         return left && right;
    }

    public boolean isSymmetric(TreeNode root) {

        return divideTree(root.left , root.right);
    }
}
