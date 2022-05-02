/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if( head == null || head.next == null) return null;
        
        var point_slow = head;
        var point_fast = head;
        
        
        while(point_slow != null && point_fast != null && point_fast.next != null){
            
            point_slow = point_slow.next;
            point_fast = point_fast.next.next;
            
            if(point_slow == point_fast){
                while(point_slow != head){
                    head = head.next;
                    point_slow = point_slow.next;
                }
                return point_slow;
            }
        }
        
        return null;
    }
}