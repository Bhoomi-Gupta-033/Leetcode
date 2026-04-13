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
    public List<Integer> inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            li.add(root.val);
            inOrder(root.right);
        }

        return li;
    }
    public boolean isValidBST(TreeNode root) {
        // while(root != null){
        //     if(root.val >= Integer.MIN_VALUE && root.val <= Integer){
        //         root = root.left;
        //     }
        // }

        inOrder(root);

        for(int i=0; i<li.size()-1; i++){
            if(li.get(i+1) <= li.get(i)) return false;
        }

        return true;
    }
}
