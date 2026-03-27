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
        
        ListNode temp = new ListNode();
        temp = head;
        int count= 0;

        while(temp != null){
            count++;
            temp = temp.next;
        } 
        
        int len = count - n;
          temp = head;

          if(len == 0) return head.next;
        while(len > 1){
            temp = temp.next;
            len--;
            System.out.println(temp);
        }

        // if(temp.next.next != null){
            temp.next = temp.next.next;
        // }

        return head;
    }
}
