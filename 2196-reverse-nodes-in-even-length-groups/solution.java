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
    public ListNode reverseEvenLengthGroups(ListNode head) {
                ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroupEnd = dummy;
        ListNode current = head;

        int groupSize = 1;

        while (current != null) {

            ListNode groupStart = current;
            int count = 0;

            // Count actual group length
            while (current != null && count < groupSize) {
                current = current.next;
                count++;
            }

            // Reverse if even length
            if (count % 2 == 0) {

                ListNode prev = current;
                ListNode node = groupStart;

                for (int i = 0; i < count; i++) {
                    ListNode nextNode = node.next;
                    node.next = prev;
                    prev = node;
                    node = nextNode;
                }

                prevGroupEnd.next = prev;
                prevGroupEnd = groupStart;

            } else {

                for (int i = 0; i < count; i++) {
                    prevGroupEnd = prevGroupEnd.next;
                }
            }

            groupSize++;
        }

        return dummy.next;

    }
}
