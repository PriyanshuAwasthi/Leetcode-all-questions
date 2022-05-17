/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return help_me(original, cloned, target);
    }
    
    private TreeNode help_me(TreeNode original, TreeNode clone, TreeNode target){
        if(original == target) return clone;
        TreeNode temp = null;
        if(original.left != null){
            temp = help_me(original.left, clone.left, target);
            if(temp != null) return temp;
        }
        if(original.right != null){
            temp = help_me(original.right, clone.right, target);
            if(temp != null) return temp;
        }
        return temp;
    }
}