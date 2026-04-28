/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean contains(TreeNode root ,TreeNode p){
          if(root == null) return false;
          if(root == p ) return true;

          return contains(root.left , p) || contains(root.right , p); 
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {    
        if(root == null) return root;
        if(p == q) return p;
        if(root == p || root == q) return root;

    if(contains(root.left , p) == true && contains(root.right , q) == true) return root;
  if(contains(root.left , p) == false && contains(root.right , q) == false) return root;
    if(contains(root.left , p) == true && contains(root.right , q) == false) return lowestCommonAncestor(root.left , p , q);
 
 if(contains(root.left , p) == false && contains(root.right , q) == true) return lowestCommonAncestor(root.right , p , q);

 return null;

    }
    
}
