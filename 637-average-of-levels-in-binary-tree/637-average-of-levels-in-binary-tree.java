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
    Queue<TreeNode> q;
    public List<Double> averageOfLevels(TreeNode root) {
        ans = new ArrayList<>();
        q = new LinkedList<>();
        q.add(root);
        q.add(null);
        helper(root, 0);
        return ans;
    }
    public void helper(TreeNode root, int level){
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
        helper(root, level + 1);
    }
}