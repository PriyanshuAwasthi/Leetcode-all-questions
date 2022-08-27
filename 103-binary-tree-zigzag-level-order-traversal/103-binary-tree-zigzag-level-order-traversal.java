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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode t = q.poll();
                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
                temp.add(t.val);
            }
            if(flag){
                ans.add(temp);
                flag = false;
            }
            else{
                Collections.reverse(temp);
                ans.add(temp);
                flag = true;
            }
        }
        return ans;
    }
}