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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        
        ListNode currNode = head;
        int size = 0;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        //[1,2] n = 2
        if(n == size){
            return head.next;
        }
        
        // ListNode dfs = size - n + 1;
        int index = size - n;
        ListNode prev = head;    
        int i = 1;
       while(i < index){
           prev = prev.next;
           i++;
       } 
        prev.next = prev.next.next;
        return head;
        
        
    }
}