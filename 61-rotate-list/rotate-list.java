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
    private int getLength(ListNode head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {
        int len = getLength(head);
        if(len == 1 || len == 0) return head;
        k %= len;
        ListNode tail = head;
        for(int i = 1; i < len - k; i++) 
            tail = tail.next;
        
        ListNode h = tail.next;
        if(h == null) return head;
        ListNode temp = tail;
        while(temp.next != null)
            temp = temp.next;
        temp.next = head;
        tail.next = null;
        return h;
    }
}