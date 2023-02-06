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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        int visited = 1;
        while (visited < left) {
            prev = cur;
            cur = cur.next;
            visited++;
        }

        ListNode lastPrev = cur;
        ListNode reversedPrev = null;
        ListNode reversedCur = cur;
        while (visited <= right) {
            ListNode next = reversedCur.next;
            reversedCur.next = reversedPrev;
            reversedPrev = reversedCur;
            reversedCur = next;
            visited++;
        }

        prev.next = reversedPrev;
        lastPrev.next = reversedCur;
        
        return dummy.next;
    }
}