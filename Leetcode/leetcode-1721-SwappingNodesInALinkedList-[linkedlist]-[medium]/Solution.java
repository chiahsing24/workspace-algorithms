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
    public ListNode swapNodes(ListNode head, int k) {
        if (head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head;
        ListNode cur = head;
        ListNode cur1 = head;
        ListNode cur2 = head;
        int visited = 0;
        while (visited < k) {
            cur = cur.next;
            visited++;
        }

        while (cur != null) {
            cur = cur.next;
            cur1 = cur1.next;
        }

        visited = 1;
        while (visited < k) {
            cur2 = cur2.next;
            visited++;
        }

        first = cur1;
        second = cur2;
        int firstVal = first.val;
        int secondVal = second.val;
        first.val = secondVal;
        second.val = firstVal;

        return head;
    }
}