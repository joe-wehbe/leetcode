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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode firstZero = head;
        head = head.next;
        firstZero.next = null;
        
        ListNode current = head;  
        while(current != null && current.next != null){
            if(current.next.val != 0){
                current.val += current.next.val;
                current.next = current.next.next;
            }
            else{
                if(current.next.next != null){
                    current.next = current.next.next;
                    current = current.next;        
                }
                else{
                    current.next = null;
                }
            }
        }
        return head;
    }
}