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
    public ListNode[] splitListToParts(ListNode head, int k) {
         ListNode[] result = new ListNode[k];

        int length = 0;
        ListNode temp = head;

        // Count total nodes
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int partSize = length / k;
        int extraNodes = length % k;

        ListNode current = head;

        for (int i = 0; i < k; i++) {

            result[i] = current;

            int currentPartSize = partSize;

            if (extraNodes > 0) {
                currentPartSize++;
                extraNodes--;
            }

            // Move to last node of current part
            for (int j = 1; j < currentPartSize; j++) {
                if (current != null) {
                    current = current.next;
                }
            }

            // Break connection
            if (current != null) {
                ListNode nextPart = current.next;
                current.next = null;
                current = nextPart;
            }
        }

        return result;
    }
}
