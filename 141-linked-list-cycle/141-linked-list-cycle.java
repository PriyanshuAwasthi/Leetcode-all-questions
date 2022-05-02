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
    public boolean hasCycle(ListNode head) {
        if( head == null || head.next == null) return false;
        var point_slow = head;
        var point_fast = head;
        if(head.next == null) return false;
        while(point_slow != null && point_fast != null && point_fast.next != null){
            point_slow = point_slow.next;
            point_fast = point_fast.next.next;
            if(point_slow == point_fast) return true;
        }
        return false;
    }
}