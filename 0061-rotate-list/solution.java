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
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp  != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[count];
        int index = 0;
        while(temp  != null){
            arr[index] = temp.val;
            index++;
            temp = temp.next;
        }
         if(count == 0) return null;
         if(count == 1) return head;
        if(k == count) return head;
        
         k = k % count;
        if (k == 0) return head;

        int[] ans = new int[count];

        int s = count-k;
        int j = 0;
        for(int i = s; i<count;i++){
            ans[j] = arr[i];
            j++;
        }
         
         for(int i = 0; i<s;i++){
            ans[j] = arr[i];
            j++;
        }

        ListNode start = new ListNode(0);
        temp = start;

        for(int i = 0; i<count; i++){
            temp.next = new ListNode(ans[i]);
            temp = temp.next;
        }
          
           return start.next;
    }
}
