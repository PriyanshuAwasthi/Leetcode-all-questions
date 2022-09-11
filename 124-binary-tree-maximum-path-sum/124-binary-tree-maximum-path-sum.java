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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int rSum = pathSum(root);
        return max;
    }
    public int pathSum(TreeNode root){
        if(root==null) return 0;
        int leftMax = Math.max(pathSum(root.left), 0 );
        int rightMax = Math.max(pathSum(root.right), 0);
        int fullPath = leftMax + rightMax + root.val;
        if(max<fullPath) max = fullPath;   
        return Math.max(leftMax, rightMax) + root.val;
    }
}