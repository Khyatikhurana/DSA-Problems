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
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        //detetcing cycle
        ListNode H = head;
        ListNode T = head;
        boolean cycle = false;
        
        while(H != null && H.next != null){
            H = H.next.next;
            T = T.next;
            if(H == T){
               cycle = true;
                break;
            }
            
        }
        if(!cycle){
            return null;
        }
        
        T = head;
        while(T != H){
            T = T.next;
            H = H.next;
        }
        
        return T;
        
        
        
    }
}