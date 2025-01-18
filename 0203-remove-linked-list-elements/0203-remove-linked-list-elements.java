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
    public ListNode removeElements(ListNode head, int val) {
        ListNode current = head;

        while (current != null && current.val == val) {
            head = head.next;
            current.next = null;
            current = head;
        }

        while (current != null && current.next != null) {
            while (current.next != null && current.next.val == val) {
                current.next = current.next.next;
            }

            current = current.next;
        }

        return head;
    }
}