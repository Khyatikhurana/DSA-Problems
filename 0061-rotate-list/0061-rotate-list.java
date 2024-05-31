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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k ==0){
            return head;
        }
        ListNode curr = head;
        int size = 1; //start from 1 as last node is not being counted
        while(curr.next != null){
            curr = curr.next;
            size++;
        }
        //last node
        curr.next = head;
        k = k%size;
        int last = size -k;
        while(last != 0){
            curr = curr.next;
            last--;
        }
        //reached size - kth node 
        head = curr.next;
        curr.next = null;
        return head;
        
                           
        
    }
}