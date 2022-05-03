/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> res = new HashMap<Node, Node>();
        var temp = head;
        while(temp != null){
            res.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            Node dummy = res.get(temp);
            dummy.next = res.get(temp.next);
            dummy.random = res.get(temp.random);
            temp = temp.next;
        }
        
        return res.get(head);
    }
}