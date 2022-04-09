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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        var curr1 = list1;
        var curr2 = list2;
        var temp_node = temp;
        while(curr1 != null && curr2 != null){
            if(curr1.val <= curr2.val){
                temp_node.next = curr1;
                curr1 = curr1.next;
            }
            else{
                temp_node.next = curr2;
                curr2 = curr2.next;
            }
            temp_node = temp_node.next;
        }
        
        if(curr1 == null) temp_node.next = curr2;
        else temp_node.next = curr1;
        return temp.next;
    }
}