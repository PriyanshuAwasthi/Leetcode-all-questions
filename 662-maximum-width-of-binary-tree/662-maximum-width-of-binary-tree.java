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
public class Pair{
    TreeNode root;
    int count;
    public Pair(TreeNode _root, int _count){
        count = _count;
        root = _root;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans = 0;
        if(root == null) return 0;
        Queue<Pair> temp = new LinkedList<>();
        temp.add(new Pair(root, 0));
        while(!temp.isEmpty()){
            int len = temp.size();
            int num = temp.peek().count;
            int frst = 0, last = 0;
            for(int i = 0; i < len; i++){
                int id = temp.peek().count - num;
                TreeNode t = temp.peek().root;
                temp.poll();
                if(i == 0) frst = id;
                if(i == len - 1) last = id;
                if(t.left != null) temp.offer(new Pair(t.left, 2 * id + 1));
                if(t.right != null) temp.offer(new Pair(t.right, 2 * id + 2));
            }
            ans = Math.max(ans, last - frst + 1);
        }
        return ans;
    }
}