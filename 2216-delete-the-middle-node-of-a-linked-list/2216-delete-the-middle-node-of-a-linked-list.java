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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) {
            return null;
        }

        ListNode current1 = head;
        ListNode current2 = head;
        ListNode temp = head;

        while (current1 != null && current1.next != null) {
            current1 = current1.next;

            if (current1.next != null) {
                current1 = current1.next;
            }

            temp = current2;
            current2 = current2.next;
        }
        temp.next = current2.next;
        
        return head;
    }
}