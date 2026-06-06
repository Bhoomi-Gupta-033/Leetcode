
class Solution {
    int sum = 0;

    public int helper(TreeNode root){
        if(root == null) return 0;

        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sum+=root.left.val;
            }
            helper(root.left);
        }
        helper(root.right);

        return sum;
    }
    public int sumOfLeftLeaves(TreeNode root) {
        

        helper(root);
        return sum;
    }
}
