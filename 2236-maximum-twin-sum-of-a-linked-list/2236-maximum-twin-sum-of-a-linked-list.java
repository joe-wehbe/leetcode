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
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode current = head;

        while (current != null) {
            n++;
            current = current.next;
        }

        int half = (n / 2) - 1;
        int index = 0;
        ListNode reversed = null;
        ListNode tail = null;
        ListNode second = null;
        current = head;

        while (current != null) {
            if (index <= half) {
                reversed = new ListNode(current.val, reversed);
                if (tail == null) {
                    tail = reversed;
                    second = reversed;
                }
            } 
            else {
                tail.next = new ListNode(current.val);
                tail = tail.next;
            }
            current = current.next;
            index++;
        }

        ListNode first = reversed;
        second = second.next;
        int max = 0;

        while (second != null) {
            max = Math.max(first.val + second.val, max);
            first = first.next;
            second = second.next;
        }

        return max;
    }
}