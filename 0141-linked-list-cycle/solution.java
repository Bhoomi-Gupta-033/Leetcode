/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set1 = new HashSet<>();
        ListNode temp = head;

        while(temp != null){
             if(set1.contains(temp)) return true;
              set1.add(temp);
             temp = temp.next;
        }
            
        return false;
    }
}
