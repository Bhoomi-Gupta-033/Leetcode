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
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast= head;

        while(fast != null && fast.next != null){ 
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow.next == null){
            // delete last node → we must find previous
            ListNode temp = head;
            while(temp.next != slow){
                temp = temp.next;
            }
            temp.next = null;
        } else {
            // your logic
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        }

        return head;

    }
}
