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
        //using hare and turtle method
        ListNode H = head;
        ListNode T = head;
        while(H.next != null && H.next.next != null){
            H = H.next.next;
            T = T.next;
        }
        return T;
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            ListNode next = curr.next;
            //reverse
            curr.next = prev;
            //update
            prev = curr;
            curr = next;
            
            
        }
        head.next = null; //removing forward link
        head = prev;
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode middle = getMiddle(head); //last elem of first half
        ListNode secondHalfStart = reverse(middle.next);
        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
        
    }
    
    
}