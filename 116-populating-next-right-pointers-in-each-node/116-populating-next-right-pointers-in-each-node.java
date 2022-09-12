/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList();
        if(root == null) return root;
        root.next = null;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            Node t = null;
            for(int i = 0; i < n; i++){
                Node temp = q.poll();
                if(i == n - 1) temp.next = null;
                if(t != null) t.next = temp;
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                t = temp;
            }
        }
        return root;
    }
}