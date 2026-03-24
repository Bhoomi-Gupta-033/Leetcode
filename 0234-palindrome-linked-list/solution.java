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
    public boolean isPalindrome(ListNode head) {
       
       Stack<Integer> dummy = new Stack<>();

       ListNode temp = head;

       while(temp != null){
        dummy.push(temp.val);
        temp = temp.next;
       }

        temp = head;
       while(temp != null){
          if(temp.val != dummy.pop()){
            return false;
          }

          temp = temp.next;
       }

       return true;

    }
}
