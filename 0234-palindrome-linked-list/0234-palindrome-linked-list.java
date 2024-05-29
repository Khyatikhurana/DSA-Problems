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
    
    public ListNode getMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;    
    }
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode middle = getMiddle(head); //last elem of first half
        ListNode secondHead = reverse(middle.next);
        ListNode firstHead = head;
        
        while(secondHead != null){
            if(secondHead.val != firstHead.val){
                return false;
            }
            
            secondHead = secondHead.next;
            firstHead = firstHead.next;
        }
        return true;
        
    }
    
    
}