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
    Map<Integer, Integer> map = new HashMap<>();
    int postIndex ;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
         for(int i = 0;i<n ;i++){
            map.put(inorder[i] , i);
         }
          postIndex = postorder.length-1;
         return helper(postorder , 0 , n-1);
    }

    private TreeNode helper(int[] postorder, int start, int end) {
        if(start > end) return null;

        int rootVal = postorder[postIndex];
        TreeNode root = new TreeNode(rootVal);
        int index = map.get(rootVal);
        postIndex--;
        root.right = helper(postorder , index +1 , end);
        root.left = helper(postorder , start ,index -1);

        return root;

    }
}
