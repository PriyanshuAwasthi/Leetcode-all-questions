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
    private ArrayList<Integer> res = new ArrayList<Integer>();
    int temp = -1;
    public BSTIterator(TreeNode root) {
        inorder(root, res);
    }
    private void inorder(TreeNode root, List<Integer> res){
        if(root == null) return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
    public int next(){
        if(temp == -1){
            int i = 0;
            temp = 1;
            return res.get(i);
        }
        int i = temp;
        temp += 1;
        return res.get(i);
    }
    
    public boolean hasNext() {
        if(temp < res.size()){
            return true;
        }
        else if(temp == res.size()) return false;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */