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

    //  public static boolean divideTree(TreeNode p  , TreeNode q , int targetSum){
    //     if(p == null && q == null) return 0;
        
    //     if(p.val != q.val) return false;

    //     int  left = divideTree(p.left , q.right , targetSum);
    //     int  right = divideTree(p.right , q.left , targetSum);

    //     if(left == targetSum || right == targetSum) return true;
    //     return false;
    // }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        // public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;

    // leaf node
    if (root.left == null && root.right == null) {
        return targetSum == root.val;
    }

    return hasPathSum(root.left, targetSum - root.val) ||
           hasPathSum(root.right, targetSum - root.val);
          
    }
}
