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
    //  public static boolean divideTree(TreeNode p  , TreeNode q){
    //     // if(p == null && q == null) return true;
    //     // if(p == null || q == null) return false;
    //     // if(p.val != q.val) return false;

    //     TreeNode left = divideTree(p.left , q.right);
    //     TreeNode right = divideTree(p.right , q.left);

    //      left = right
    // }

    public TreeNode invertTree(TreeNode root) {
         if(root == null) return root;

         TreeNode temp = root.left;
         root.left = root.right;
         root.right = temp;

         invertTree(root.left);
         invertTree(root.right);

        

        return root;
    }
}
