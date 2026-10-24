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

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;
        int i = 1;
        while(i < k && tail != null) {
            tail = tail.next;
            i++;
        }
        if(tail == null)
            return head;
        ListNode h1 = reverseKGroup(tail.next,k);
        tail.next = null;
        return reverseList(head,h1);
    }
}