/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> ans = new ArrayList<>();
    HashMap<TreeNode, TreeNode> hm = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        helper(root);
        Queue<TreeNode> q = new LinkedList();
        Set<TreeNode> check = new HashSet<>();
        check.add(target);
        q.add(target);
        int lev = 0;
        while(!q.isEmpty()){
            if(lev == k) break;
            lev++;
            int len = q.size();
            for(int i = 0; i < len; i++){
                TreeNode temp = q.poll();
                if(temp.left != null && !check.contains(temp.left)){
                    q.add(temp.left);
                    check.add(temp.left);
                }
                if(temp.right != null && !check.contains(temp.right)){
                    q.add(temp.right);
                    check.add(temp.right);
                }
                if(hm.containsKey(temp) && !check.contains(hm.get(temp))){
                    q.add(hm.get(temp));
                    check.add(hm.get(temp));
                }
            }
        }
        while(!q.isEmpty()) ans.add(q.poll().val);
        return ans;
    }
    public void helper(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            if(n.left != null){
                hm.put(n.left, n);
                q.add(n.left);
            }
            if(n.right != null){
                hm.put(n.right, n);
                q.add(n.right);
            }
        }
    }
}