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
    int p = Integer.MIN_VALUE;
    int q = Integer.MIN_VALUE;

    public List<Integer> inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            li.add(root.val);
            inOrder(root.right);
        }

        return li;
    }
    
    public void recoverTree(TreeNode root) {
        inOrder(root);

        for(int i = 0; i<li.size()-1; i++){
            if(li.get(i) > li.get(i+1)){
               if(p == Integer.MIN_VALUE){
                 p = li.get(i);
                q= li.get(i+1);
               }else{
                q = li.get(i+1);
               }
            }
        }
          swap(root);

    }

    public void swap(TreeNode root){
        if(root == null) return;

        if(root != null){
            if(root.val == p){
                root.val = q;
            }else if(root.val == q){
                root.val = p;
            }

        }
        swap(root.left);
        swap(root.right);
    }
}
