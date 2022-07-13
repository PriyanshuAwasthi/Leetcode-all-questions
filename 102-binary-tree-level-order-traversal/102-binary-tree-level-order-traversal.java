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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<TreeNode> temp1 = new LinkedList<>();
        temp1.add(root);    
        temp1.add(null);
        helper(temp1, res, 0);
        return res;
    }
    
    public void helper(Queue<TreeNode> temp1, ArrayList<List<Integer>> res, int level){
        if(temp1.peek()==null)
            return;
        TreeNode t = temp1.poll();
        while(t!=null){
            if(level == res.size()){
                res.add(new ArrayList<Integer>());
                res.get(level).add(t.val);
            }
            else if(level < res.size()) 
                res.get(level).add(t.val);

            if(t.left != null){
                temp1.add(t.left);
            }
            if(t.right != null){
                temp1.add(t.right);
            }
             t = temp1.poll();
        }
        temp1.add(null);
        helper( temp1, res, level + 1);
        return;
    }
}