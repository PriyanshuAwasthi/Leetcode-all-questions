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
    private TreeNode fr;
    private TreeNode ls;
    private TreeNode mid;
    private TreeNode pre;
    
    public void recoverTree(TreeNode root) {
        fr = mid = ls = null;
        inorder(root);
        
        if(fr != null && ls != null){
            int temp = fr.val;
            fr.val = ls.val;
            ls.val = temp;
        }
        else{
            int temp = fr.val;
            fr.val = mid.val;
            mid.val = temp;
        }
    }
    
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if(pre != null && (root.val < pre.val)){
            if(fr == null){
                fr = pre;
                mid = root;
            }
            else{
                ls = root;
            }
        }
        
        pre = root;
        inorder(root.right);
    }
}