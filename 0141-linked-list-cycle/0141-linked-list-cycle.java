/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode hare = head;
        ListNode turt = head;
        while(hare != null && hare.next!= null){
            hare = hare.next.next;
            turt = turt.next;
            if(turt == hare){
                return true;
            }
        }
        return false;
        
        
        
    }
}