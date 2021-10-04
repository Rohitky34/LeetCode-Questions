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
        if(head == null || head.next == null) return null;
        
        ListNode cycle = getCycle(head);
        if(cycle == null) return null;
        ListNode start = head;
        while(cycle != start){
            start = start.next;
            cycle = cycle.next;
        }
        return cycle;
        
        
    }
    public ListNode getCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }            
        }
        return null;
    }}


