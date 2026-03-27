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
    public int[] nextLargerNodes(ListNode head) {
        int len = 0;
        ListNode temp = head; 

        while(temp != null){
          len++;
          temp = temp.next;
        } 

        int[] arr = new int[len];
         int i =0;
         temp =head;

         while(temp != null){
            arr[i] = temp.val;
            temp =temp.next;
            i++;
         } 
         int[] ans = new int[len];
         
         for(int k=0; k<len;k++){
              for(int j =k; j<len; j++) {
                if(arr[j] > arr[k]){
                    ans[k] = arr[j];
                    break;
                }
              } 
         }
          
          return ans;
          

    }
}
