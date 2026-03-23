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
    public ListNode mergeKLists(ListNode[] lists) {
       ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i<lists.length; i++){
                ListNode temp = lists[i];

                while(temp != null){
                    li.add(temp.val);
                    temp = temp.next;
                }

        }
       Collections.sort(li);
       ListNode start = new ListNode(0);
       ListNode temp = start;

       for(int i =0; i<li.size(); i++){
        temp.next = new ListNode(li.get(i));
        temp = temp.next;
       }

       return start.next;

    }
}
