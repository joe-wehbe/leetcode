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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode current = head;
        while(current != null && current.next != null){
            ListNode tempNode = current.next;
            current.next = new ListNode(findGreatestCommonDivisor(current.val, current.next.val));
            current.next.next = tempNode;
            current =  current.next.next;
        }
        return head;
    }
    
    private static int findGreatestCommonDivisor(int num1, int num2){
        while(num2 > 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}