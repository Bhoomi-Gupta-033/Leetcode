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
    public ListNode removeZeroSumSublists(ListNode head) {
          ListNode dummy = new ListNode(0);
        dummy.next = head;

        HashMap<Integer, ListNode> map = new HashMap<>();

        int prefixSum = 0;
        ListNode current = dummy;

        // Store latest node for each prefix sum
        while (current != null) {
            prefixSum += current.val;
            map.put(prefixSum, current);
            current = current.next;
        }

        prefixSum = 0;
        current = dummy;

        // Remove zero sum parts
        while (current != null) {
            prefixSum += current.val;
            current.next = map.get(prefixSum).next;
            current = current.next;
        }

        return dummy.next;
    }
}
