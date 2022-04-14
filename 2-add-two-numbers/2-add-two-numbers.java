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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        var temp = res;
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            if(sum <= 9) carry = 0;
            else{
                sum %= 10;
                carry = 1;
            }
            temp.next = new ListNode(sum);
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            temp = temp.next;
        }
        if(carry == 1) temp.next = new ListNode(1);
        return res.next;
    }
}