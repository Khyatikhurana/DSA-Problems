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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        ListNode hare = head;
        ListNode turt = head;
        while(hare.next != null && hare.next.next != null ){
            hare = hare.next.next;
            turt = turt.next;
        }
        if(size%2 == 0)
            return turt.next;
        else
            return turt;
            
        
        
        
        
    }
}