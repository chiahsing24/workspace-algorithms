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
    public ListNode getSecondHalfStartNode(ListNode head) {
        if (head.next == null) return null;
        if (head.next.next == null) return head.next;
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.next;
    }
    
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        
        ListNode pre = null;
        ListNode newHead;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        
        return pre;
    }
    
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        ListNode secondStart = getSecondHalfStartNode(head);
        ListNode newSecondStart = reverseList(secondStart);
        while (newSecondStart != null) {
            if (head.val != newSecondStart.val) {
                return false;
            }
            head = head.next;
            newSecondStart = newSecondStart.next;
        }
        return true;
    }
}