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
    TreeNode temp = new TreeNode();
    TreeNode parent = temp;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null )return null;
        increasingBST(root.left); 
        temp.right = new TreeNode(root.val);
        temp = temp.right;
        increasingBST(root.right);    
        return parent.right;
    }
}