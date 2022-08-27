/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    public String serialize(TreeNode root) {
        if(root == null) return "";
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t == null){
                sb.append("n ");
                continue;
            }
            sb.append(t.val + " ");
            q.add(t.left);
            q.add(t.right);
        }
        return sb.toString();
    }
    public TreeNode deserialize(String data) {
        if(data == "") return null;
        Queue<TreeNode> q = new LinkedList<>();
        String []arr= data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        for(int i = 1; i < arr.length; i++){
            TreeNode par = q.poll();
            if(!arr[i].equals("n")){
                TreeNode l = new TreeNode(Integer.parseInt(arr[i]));
                par.left = l;
                q.add(l);
            }
            if(!arr[++i].equals("n")){
                TreeNode r = new TreeNode(Integer.parseInt(arr[i]));
                par.right = r;
                q.add(r);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));