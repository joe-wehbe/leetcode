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
    public ListNode modifiedList(int[] nums, ListNode head) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        
        ListNode temp = head;
        while(set.contains(head.val)){
            head = head.next;
            temp.next = null;
            temp = head;
        } 
        
        ListNode current = head.next;
        while(current != null){
            if(set.contains(current.val)){
                temp.next = current.next;
                current.next = null;
                current = temp.next;
            }
            else{
                current = current.next;
                temp = temp.next;              
            }
        }
        
        return head;
    }
}