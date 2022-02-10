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
    public ListNode getNextNonRepetitiveNode(ListNode start, int val) {
        ListNode cur = start;
        while (cur != null && cur.val == val) {
            cur = cur.next;
        } 
        return cur;
    }
    
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        
        ListNode nextStart = getNextNonRepetitiveNode(head, head.val);
        ListNode cur = head;
        cur.next = nextStart;
        cur = cur.next;
        if (cur == null) {
            return head;
        }
        
        while (cur != null) {
            nextStart = getNextNonRepetitiveNode(cur, cur.val);
            cur.next = nextStart;
            cur = cur.next;
        }
        
        return head;
    }
}