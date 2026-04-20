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
    ArrayList<Integer> li = new ArrayList<>();
    public List<Integer> inorder(TreeNode root){

        if(root != null){
            inorder(root.left);
            li.add(root.val);
            inorder(root.right);
        }

        return li;
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;

        inorder(root);

        // Collections.sort(li);

        return li.get(k-1);
            }
}
