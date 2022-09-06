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
/*class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root==null)return null;
       
       helper(root);
        
        return root;
    }
    public int helper(TreeNode root){
        if(root==null)return 0;
        if(root.val==1)return 1;
        int  left=helper(root.left);
        int  right=helper(root.right);
        if(left!=1)root.left=null;
        if(right!=1)root.right=null;
        return 0;
    }
}*/
/*class Solution{
    public TreeNode pruneTree(TreeNode root){
        int h = helper(root);
        return root;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        if(l == 1 || r == 1) return 1;
        if(l != 1) root.left = null;
        if(r != 1){
            root.right = null;
            //root = null;
            //return 0;
        }
        return root.val;
    }
}*/
class Solution{
    public TreeNode pruneTree(TreeNode root){
        if(root == null) return null;
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.val == 0 && root.left == null && root.right == null) return null;
        return root;
    }
}