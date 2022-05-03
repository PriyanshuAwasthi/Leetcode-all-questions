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
        Map<Node, Node> map = new HashMap<>();
        Node temp = head;
        while(temp != null){
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        
        temp = head;
        while(temp != null){
            Node temp_node = map.get(temp);
            temp_node.next = map.get(temp.next);
            temp_node.random = map.get(temp.random);
            temp = temp.next;
        }
        
        return map.get(head);
    }
}