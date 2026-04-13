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
    public TreeNode helper(int[] nums , int low , int high){
         if(low > high){
              return null;
         }

         int mid = (low + high)/2;
         TreeNode root = new TreeNode(nums[mid]);
         root.left = helper(nums , low , mid-1);
         root.right = helper(nums , mid+1 , high);

         return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        // int low = 0;
        // int high = nums.length -1;
        // int middle= (low + high)/2;
        //  TreeNode root = new TreeNode(nums[middle]);
        //  low = middle +1;
        // while(low <= high){
        //     int mid = (low + high)/2;
        //      root.right = new TreeNode(nums[mid]);
        //     low = mid+1;
        // }

        // low = 0;
        // high = middle -1;

        // while(low <= high){
        //     int mid = (low + high)/2;
        //     root.left = new TreeNode(nums[mid]);
        //    high = mid -1;
        // }

        // return root;

        return helper(nums , 0 , nums.length-1);
    }
}
