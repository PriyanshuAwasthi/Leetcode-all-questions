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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1;
        ListNode pre = null;
        ListNode curr = null;
        ListNode next = null;
        ListNode dummy = head;
        ListNode rnode = head;
        while(count != right){
            rnode = rnode.next;
            count++;
        }
        count = 1;
        if(left == count){
            while(right >= count){
                next = dummy.next;
                dummy.next = (count == left) ? rnode.next : pre;
                pre = dummy;
                dummy = next;
                count++;
            }
            head = pre;
        }
        else{
            while(count != left - 1){
                dummy = dummy.next;
                count++;
            }
            count++;
            curr = dummy.next;
            while(right >= count){
                next = curr.next;
                curr.next = (count == left) ? rnode.next : pre;
                pre = curr;
                curr = next;
                count++;
            }
            dummy.next = pre;
        }
        return head;
    }
}
/*
int count = 1;
        ListNode pre = null;
        ListNode next = null;
        var rnode = head;
        ListNode dummy = head;
        ListNode curr = null;
        while(count != right){
            rnode = rnode.next;
            count++;
        }
        count = 1;
        if(count == left){
            while(right >= count){
                next = dummy.next;
                dummy.next = (count == left) ? rnode.next : pre;
                pre = dummy;
                dummy = next;
                count++;
            }
            head = pre;
        }
        else{
            while(count != (left - 1)){
                dummy = dummy.next;
                count++;
            }
            count++;
            curr = dummy.next;
            while(right >= count){
                next = curr.next;
                curr.next = (left == count) ? rnode.next : pre;
                pre = curr;
                curr = next;
                count++;
            }
            dummy.next = pre;
        }
        return head;
        */