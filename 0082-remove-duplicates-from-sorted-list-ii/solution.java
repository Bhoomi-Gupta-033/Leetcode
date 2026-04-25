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
    public ListNode deleteDuplicates(ListNode head) {
        TreeMap<Integer , Integer> map = new TreeMap<>();
       ListNode temp = head;
       while(temp != null){
         map.put(temp.val , map.getOrDefault(temp.val , 0) + 1); 
        temp = temp.next;
       }
       
        
       ListNode start = new ListNode(0);
       temp = start;
       for(int num : map.keySet()){
        if(map.get(num) == 1){
            temp.next = new ListNode(num);
            temp = temp.next;
        }
         
       }

       return start.next;
    }
}
