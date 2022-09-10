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
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        var fast = head;
        var slow = head;
        var pre = head;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        ListNode t1 = sortList(head);
        ListNode t2 = sortList(slow);
        return helper(t1, t2);
    }
    public ListNode helper(ListNode h1, ListNode h2){
        ListNode dummy = new ListNode();
        var dum = dummy;
        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                dum.next = h1;
                h1 = h1.next;
            }
            else{
                dum.next = h2;
                h2 = h2.next;
            }
            dum = dum.next;
        }
        while(h1 != null){
            dum.next = h1;
            h1 = h1.next;
            dum = dum.next;
        }
        while(h2 != null){
            dum.next = h2;
            h2 = h2.next;
            dum = dum.next;
        }
        return dummy.next;
    }
}