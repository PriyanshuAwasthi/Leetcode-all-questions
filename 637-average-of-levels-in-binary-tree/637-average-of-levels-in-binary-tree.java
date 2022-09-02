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
    List<Double> ans;
    public List<Double> averageOfLevels(TreeNode root) {
        ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        helper(root, q, 0);
        return ans;
    }
    public void helper(TreeNode root, Queue<TreeNode> q, int level){
        if(q.peek() == null) return;
        TreeNode t = q.poll();
        double avg = 0;
        int count = 0;
        while(t != null){
            count++;
            avg += t.val;
            if(t.left != null) q.add(t.left);
            if(t.right != null) q.add(t.right);
            t = q.poll();
        }
        avg = (double) (avg / count);
        ans.add(avg);
        q.add(null);
        helper(root, q, level + 1);
    }
}