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
    public ListNode oddEvenList(ListNode head) {
        int len = 0;

        ListNode temp = head;
 
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        temp = head;
        int i = 0;

        while(temp != null){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }
        
        int[] res = new int[len];
        int k =0;
        
        for(int j = 0; j<len; j++){
              if(j %2 == 0){
                res[k] = arr[j] ;
                k++;
              }
              
        }

        for(int j = 0; j<len; j++){
              if(j%2 != 0){
                res[k] =  arr[j];
                k++;
              }
              
        }

        ListNode start = new ListNode();
        temp = start;

        for(int j =0; j<len; j++){
            temp.next = new ListNode(res[j]);
             temp = temp.next;
        }
          
        return start.next;
    }
}
