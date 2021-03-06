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
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        int depth = max_depth(root);
        find_sum(root, 1, depth);
        return sum;
    }
    
    private int max_depth(TreeNode root){
        if(root == null) return 0;
        int l_d = max_depth(root.left);
        int r_d = max_depth(root.right);
        if(l_d > r_d) return l_d + 1;
        else return r_d + 1;
    }
    
    private void find_sum(TreeNode root, int i, int depth){
        if(root != null){
            if(depth == i){
                sum += root.val;
            }
            find_sum(root.left, i + 1, depth);
            find_sum(root.right, i + 1, depth);
        }
    }
}