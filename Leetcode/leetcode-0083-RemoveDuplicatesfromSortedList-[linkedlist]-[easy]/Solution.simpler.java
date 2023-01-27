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
    public ListNode deleteDuplicates(ListNode head) {
        int visited = -1000;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            if (visited == -1000 || cur.val != visited) {
                visited = cur.val;
                prev = cur;
                cur = cur.next;
            } else {
                cur = cur.next;
                prev.next = cur;
            }
        }

        return head;
    }
}