/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        var dum1 = headA;
        var dum2 = headB;
        
        while(dum1 != dum2){
            if(dum1 == null) dum1 = headB;
            else dum1 = dum1.next;
            
            if(dum2 == null) dum2 = headA;
            else dum2 = dum2.next;
        }
        
        return dum1;
    }
}