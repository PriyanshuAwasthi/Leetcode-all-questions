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
    int ans = 0;
    public int minCameraCover(TreeNode root) {
        if(preorder(root) == -1) return ++ans;
        return ans;
    }
    
    private int preorder(TreeNode root){
        if(root == null) return 1;
        
        var left = preorder(root.left);
        var right = preorder(root.right);
        
        if(left == -1 || right == -1){
            ans++;
            return 0;
        }
        
        if(left == 0 || right == 0) return 1;
        
        return -1;
    }
}