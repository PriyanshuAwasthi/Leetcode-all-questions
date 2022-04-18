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
    ArrayList<Integer> mem = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        root = inorder(root, mem);
        return mem.get(k - 1);
    }
    
    public TreeNode inorder(TreeNode root, List<Integer> mem){
        if(root == null) return null;
        inorder(root.left, mem);
        mem.add(root.val);
        inorder(root.right, mem);
        return root;
    }
}