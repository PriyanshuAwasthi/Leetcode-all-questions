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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int count = 1;
        ListNode dummy = head;
        while(dummy.next != null){
            dummy = dummy.next;
            ++count;
        }
        
        k %= count;
        if(k == 0) return head;
        var slow = head;
        var fast = head;
        
        int i = 0;
        while(i != k){
            fast = fast.next;
            i++;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode res = slow.next;
        slow.next = null;
        fast.next = head;
        
        return res;
    }
}