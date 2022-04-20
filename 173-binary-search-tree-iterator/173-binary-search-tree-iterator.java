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
class BSTIterator {
    Stack<TreeNode> res = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        Push(root);
    }
    
    public int next() {
        TreeNode t = res.pop();
        Push(t.right);
        return t.val;
    }
    
    public boolean hasNext() {
        return !res.isEmpty();
    }
    
    private void Push(TreeNode root){
        for(; root != null; res.push(root), root = root.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */