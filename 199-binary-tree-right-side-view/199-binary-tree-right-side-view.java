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
    ArrayList<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        helper(root, 0);
        return res;
    }
    
    public void helper(TreeNode root, int lev){
        if(root == null) return;
        if(lev == res.size()) res.add(root.val);
        helper(root.right, lev + 1);
        helper(root.left, lev + 1);
    }
}