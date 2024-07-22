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

import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        BigInteger num1 = ListNodeToBigInteger(l1);
        BigInteger num2 = ListNodeToBigInteger(l2);
        
        BigInteger sum = num1.add(num2);
        String strNum = sum.toString();
        
        ListNode result = new ListNode(0);
        ListNode current = result;
        
        for(int i = strNum.length() - 1; i >= 0; i--){
            current.next = new ListNode(strNum.charAt(i) - '0');
            current = current.next;
        }
        
        return result.next;
    }
    
    private BigInteger ListNodeToBigInteger(ListNode node){
        
        ListNode current = node;
        StringBuilder sb = new StringBuilder(); 
        
        while(current != null){
            sb.append(current.val);
            current = current.next;
        }
        
        return new BigInteger(sb.reverse().toString());
    }
}