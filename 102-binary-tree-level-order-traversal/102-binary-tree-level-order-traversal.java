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
        int level = 0;
        Queue<Pair<TreeNode, Integer>> temp1 = new LinkedList<>();
        temp1.add(new Pair(root, level));
        List<Integer> tem = new ArrayList<>();
        while(!temp1.isEmpty()){
            while(temp1.peek() != null && temp1.peek().getValue() == level){
                TreeNode t = temp1.peek().getKey();
                temp1.poll();
                tem.add(t.val);
                if(t.left != null) temp1.add(new Pair(t.left, level + 1)); 
                if(t.right != null) temp1.add(new Pair(t.right, level + 1));
            }
            res.add(tem);
            tem = new ArrayList<Integer>();
            level++;
        }
        return res;
    }
}