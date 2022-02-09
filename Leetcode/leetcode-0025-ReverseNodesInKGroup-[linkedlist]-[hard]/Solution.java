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
    public ListNode getKGroupEnd(ListNode head, int k) {
        // 注意: k > 0 的話會多跑一位
        while (head != null && k > 1) {
            head = head.next;
            k--;
        }
        return head;
    }
    
    public void reverseWithinKGroup(ListNode start, ListNode end) {
        end = end.next;
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = start;
        while (cur != end) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = end;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode end = getKGroupEnd(head, k);
        if (end == null) {
            return head;
        }
        
        ListNode start = head;
        head = end;
        reverseWithinKGroup(start, end);
        ListNode lastEnd = start;
        while (lastEnd.next != null) {
            start = lastEnd.next;
            end = getKGroupEnd(start, k);
            if (end == null) {
                return head;
            }
            
            reverseWithinKGroup(start, end);
            lastEnd.next = end;
            lastEnd = start;
        }
        return head;
    }
}