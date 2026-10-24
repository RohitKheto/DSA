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
        ListNode newHead = head;
        ListNode tail = head;
        ListNode temp = null;
        int i = 1;
        while(i <= k && tail != null) {
            temp = tail;
            tail = tail.next;
            i++;
        }

        if(i <= k) return newHead;

        ListNode h1 = reverseKGroup(tail,k);
        temp.next = null;
        return reverseList(newHead,h1);
    }
}