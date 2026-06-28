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
class BSTIterator {
    ArrayList<Integer> li = new ArrayList<>();
    int pointer = -1;
    public BSTIterator(TreeNode root) {
        TreeNode temp = root;
         inorder(temp);

    }
    private void inorder(TreeNode root) {
    if (root == null) {
        return;
    }

    inorder(root.left);
    li.add(root.val);
    inorder(root.right);
    }
    public int next( ) {
        int ans = 0;
        if(hasNext()){
            pointer = pointer+1;
            ans = li.get(pointer);
        }
        return ans;
   }
    
    public boolean hasNext() {
        return pointer < li.size()-1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
