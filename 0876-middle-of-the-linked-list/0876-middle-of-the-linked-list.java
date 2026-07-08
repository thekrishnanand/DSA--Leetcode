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
        ListNode onestep = head;
        ListNode twostep = head;

        while (twostep != null && twostep.next != null) {
            onestep = onestep.next;
            twostep = twostep.next.next;
        }

        return onestep;
    }
}