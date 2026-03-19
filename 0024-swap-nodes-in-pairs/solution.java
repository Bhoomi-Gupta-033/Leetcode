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
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        for (int i = 0; i < list.size() - 1; i = i + 2) {
            int a = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, a);
        }

        ListNode start = new ListNode(0);
        ListNode temp2 = start;

        for (int i = 0; i < list.size(); i++) {

            temp2.next = new ListNode(list.get(i));
            temp2 = temp2.next;
        }

        return start.next;

    }
}
