/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        var curr = dummy;
        
        while(curr.next != null && curr.next.next != null){
            var frst = curr.next;
            var sec = curr.next.next;
            frst.next = sec.next;
            sec.next = frst;
            curr.next = sec;
            curr = curr.next.next;
        }
        return dummy.next;
    }
}*/
class Solution{
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        var current = dummy;
        while(current.next != null && current.next.next != null){
            var f = current.next;
            var s = current.next.next;
            f.next = s.next;
            s.next = f;
            current.next = s;
            current = current.next.next;
        }
        return dummy.next;
    }
}