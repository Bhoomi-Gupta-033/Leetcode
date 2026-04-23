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
    public ListNode swapNodes(ListNode head, int k) {
       int size = 0;
       ListNode temp = head;

       while(temp != null){
         temp = temp.next;
         size++;
       } 
       ListNode p1 = head;
       ListNode p2 = head;  

       for(int i = 1; i < k; i++){
        p1 = p1.next;
       }

       for(int i = 1 ; i<size-k+1;i++){
        p2 = p2.next;
       }
        

        int val = p1.val;
        p1.val = p2.val;
        p2.val = val;
       
       return head;
    }
}
