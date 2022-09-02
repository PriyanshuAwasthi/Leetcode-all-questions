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
class Tuple{
    int col;
    int row;
    TreeNode root;
    public Tuple(TreeNode node, int x, int y){
        col = x;
        row = y;
        root = node;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        //       col              row    number_of_nodes_in_same_lev
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.add(new Tuple(root, 0, 0));
        while(!q.isEmpty()){
            Tuple t = q.poll();
            int c = t.col;
            int r = t.row;
            TreeNode n = t.root;
            if(!mp.containsKey(c)) mp.put(c, new TreeMap<>());
            if(!mp.get(c).containsKey(r)) mp.get(c).put(r, new PriorityQueue<>());
            mp.get(c).get(r).add(n.val); 
            if(n.left != null) q.add(new Tuple(n.left, c - 1, r + 1));
            if(n.right != null) q.add(new Tuple(n.right, c + 1, r + 1));
        }
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(TreeMap<Integer, PriorityQueue<Integer>> t1 : mp.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> t2 : t1.values()) while(!t2.isEmpty()) ans.get(ans.size() - 1).add(t2.poll());   
        }
        return ans;
    }
}