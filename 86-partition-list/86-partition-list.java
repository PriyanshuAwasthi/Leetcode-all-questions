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
    public ListNode partition(ListNode head, int x) {
        ListNode head2 = new ListNode();
        var temp = head2;
        var itt = head;
        while(itt != null){
            if(itt.val < x){
                temp.next = new ListNode(itt.val);
                temp = temp.next;
                itt.val = -101;
            }
            itt = itt.next;
        }
        while(head != null){
            if(head.val >= x && head.val != -101){
                temp.next = new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return head2.next;
    }
}