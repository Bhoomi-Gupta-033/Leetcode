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

    public ListNode doubleIt(ListNode head) {

        head = reverse(head);

        ListNode current = head;
        int carry = 0;

        while (current != null) {

            int sum = current.val * 2 + carry;

            current.val = sum % 10;
            carry = sum / 10;

            // Move to next
            if (current.next == null) {
                break;
            }

            current = current.next;
        }

        // Add leftover carry
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return reverse(head);
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }

    }

