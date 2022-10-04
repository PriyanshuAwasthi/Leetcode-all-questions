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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        boolean res = false;
        int subsum = targetSum - root.val;
        
        if(root.left == null && root.right == null && subsum == 0) return (res = true);
        
        if(root.left != null) res = res || hasPathSum(root.left, subsum);
        
        if(root.right != null) res = res || hasPathSum(root.right, subsum);
        
        
        return res;
        
    }
}