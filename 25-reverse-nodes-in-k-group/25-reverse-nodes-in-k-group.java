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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        ListNode dum = new ListNode(0);
        dum.next = head;
        var pre = dum;
        var curr = dum;
        var next = dum;
        
        var dum2 = head;
        int count = 1;
      
        while(dum2.next != null){
            dum2 = dum2.next;
            count++;
            
        }
       
        
        while(count >= k){
            curr = pre.next;
            next = curr.next;
            for(int i = 1; i < k; i++){
                curr.next = next.next;
                next.next = pre.next;
                pre.next = next;
                next = curr.next;
            }
            
            pre = curr;
            count -= k;
        }
        return dum.next;
    }
}