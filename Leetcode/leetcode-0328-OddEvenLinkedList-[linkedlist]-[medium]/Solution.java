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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) return head;
        
        ListNode end = head;
        int cnt = 0;
        while (end.next != null) {
            end = end.next;
            cnt++;
        }
        
        int steps = cnt % 2 == 0 ? cnt / 2 : (cnt / 2) + 1;
        System.out.println(end);
        ListNode newStart = head;
        while (steps != 0) {
            end.next = newStart.next;
            newStart.next = newStart.next.next;
            end.next.next = null;
            end = end.next;
            newStart = newStart.next;
            steps--;
        }
        
        return head;
    }
}