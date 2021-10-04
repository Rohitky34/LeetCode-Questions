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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0) return head;
        if(head.next == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int i=0;
        while(i < n){
            fast = fast.next;
            i++;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
    
        return dummy.next;

}
}