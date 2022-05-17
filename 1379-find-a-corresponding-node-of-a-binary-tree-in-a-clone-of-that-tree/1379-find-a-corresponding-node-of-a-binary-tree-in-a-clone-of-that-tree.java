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
    TreeNode res;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned == null) return null;
        else if(cloned.val == target.val) res = cloned;
        getTargetCopy(original, cloned.right, target);
        getTargetCopy(original, cloned.left, target);
        return res;
    }
}