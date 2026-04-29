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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
           int first = -1;
        int last = -1;
        int minDistance = Integer.MAX_VALUE;

        int index = 1;

        ListNode prev = head;
        ListNode current = head.next;

        while (current.next != null) {

            int prevVal = prev.val;
            int currVal = current.val;
            int nextVal = current.next.val;

            boolean isCritical =
                (currVal > prevVal && currVal > nextVal) ||
                (currVal < prevVal && currVal < nextVal);

            if (isCritical) {

                if (first == -1) {
                    first = index;
                } else {
                    minDistance = Math.min(minDistance, index - last);
                }

                last = index;
            }

            prev = current;
            current = current.next;
            index++;
        }

        if (first == last || first == -1) {
            return new int[]{-1, -1};
        }

        return new int[]{minDistance, last - first};
    }
}
