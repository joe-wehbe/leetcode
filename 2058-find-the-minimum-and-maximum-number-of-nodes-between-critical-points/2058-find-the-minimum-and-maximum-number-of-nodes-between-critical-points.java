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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
            
        ArrayList<Integer> criticalPts = new ArrayList<>();
        int[] answer = new int[2];
        ListNode current = head; 
        int index = 0;
        
        if(current.next.next == null){
            answer[0] = -1;
            answer[1] = -1;
            return answer;
        }
        
        while(current.next.next != null){
            if((current.next.val < current.val && current.next.val < current.next.next.val) || 
             (current.next.val > current.val && current.next.val > current.next.next.val)){
              criticalPts.add(index);
            }      
            current = current.next;
            index++;
        } 
        
        if(criticalPts.size() > 1){
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < criticalPts.size() - 1; i++){
                if(criticalPts.get(i + 1) - criticalPts.get(i) < min){
                    min = criticalPts.get(i + 1) - criticalPts.get(i);
                } 
            }      
            answer[0] = min;
            answer[1] = criticalPts.get(criticalPts.size() - 1) - criticalPts.get(0);            
        }
        else{
            answer[0] = -1;
            answer[1] = -1;
        }
        
        return answer;
    }
}