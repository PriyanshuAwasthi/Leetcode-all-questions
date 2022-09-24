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
    public List<Integer> temp;
    public List<List<Integer>> ans;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        temp = new ArrayList();
        ans = new ArrayList();
        helper(root, targetSum);
        return ans;
    }
    private void helper(TreeNode root, int n){
        if(root == null) return;
        temp.add(root.val);
        if(root.val == n && root.left == null && root.right == null) ans.add(new ArrayList<Integer>(temp));
        else{
            helper(root.left, n - root.val);
            helper(root.right, n - root.val);
        }
        temp.remove(temp.size() - 1);
    }
}