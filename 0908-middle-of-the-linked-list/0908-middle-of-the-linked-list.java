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
    public ListNode middleNode(ListNode head) {
        ListNode current1 = head;
        ListNode current2 = head;

        while (current1.next != null) {
            current1 = current1.next;

            if (current1.next != null) {
                current1 = current1.next;
            }

            current2 = current2.next;
        }

        return current2;
    }
}