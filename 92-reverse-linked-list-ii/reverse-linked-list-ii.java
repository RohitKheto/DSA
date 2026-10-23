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

    private ListNode reverseList(ListNode curr, ListNode prev) {
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode prevEnd = null;
        ListNode end = head;
        for(int l = 1; l < left; l++) {
            prev = curr;
            curr = curr.next;
        }

        for(int r = 1; r <= right; r++) {
            prevEnd = end;
            end = end.next;
        }
        prevEnd.next = null;
        ListNode temp = reverseList(curr,end);
        if(prev != null)
            prev.next = temp;
        else 
            return temp;
        return head;
    }
}