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
    public ListNode reverseList(ListNode head) {
       int count= 0;
       ListNode temp = head;

       while(temp != null){
        count++;
        temp = temp.next;
       }

       int[] arr = new int[count];
       temp = head;
       int i = 0;
       while(temp != null){
             arr[i] = temp.val;
             i++;
             temp = temp.next;
       }

        ListNode start = new ListNode(0);
        ListNode temp2 = start;  
       for(int j = count-1; j>=0 ;j--){
            temp2.next = new ListNode(arr[j]);
            temp2 = temp2.next;
       }

       return start.next;
    }
}
