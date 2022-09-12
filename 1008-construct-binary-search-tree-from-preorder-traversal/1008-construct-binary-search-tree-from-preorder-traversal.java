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
    public int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE);
    }
    public TreeNode helper(int []arr, int up){
        if(index == arr.length || up < arr[index]) return null;
        TreeNode root = new TreeNode(arr[index++]);
        root.left = helper(arr, root.val);
        root.right = helper(arr, up);
        return root;
    }
}