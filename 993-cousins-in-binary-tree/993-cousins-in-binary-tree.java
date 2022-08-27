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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode x_par = null;
        TreeNode y_par = null;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode temp = q.poll();
                if(temp.left != null){
                    q.add(temp.left);
                    if(temp.left.val == x) x_par = temp;
                    if(temp.left.val == y) y_par = temp;
                }
                if(temp.right != null){
                    q.add(temp.right);
                    if(temp.right.val == x) x_par = temp;
                    if(temp.right.val == y) y_par = temp;
                }
                if(x_par != null && y_par != null) return x_par != y_par;
            }
            if((x_par != null && y_par == null) || (x_par == null && y_par != null)) return false;
            
        }
        return false;
    }
}