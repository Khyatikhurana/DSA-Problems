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
        ListNode H = head;
        ListNode T = head;
        
        while(H != null && H.next != null){
            H = H.next.next;
            T = T.next;
            if(H == T){
                return true;
            }
            
        }
        
        return false;
        
        
    }
}