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
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode head2 = reverseSecondHalfList(slow.next);
        
        while (head != null & head2 != null) {
            if (head.val != head2.val) {
                return false;
            } else {
                head = head.next;
                head2 = head2.next;
            }
        }
        
        return true;
    }
    
    public ListNode reverseSecondHalfList(ListNode root) {
        if (root == null) return null;
        
        ListNode prev = null;
        while (root != null) {
            ListNode next = root.next;
            root.next = prev;
            prev = root;
            root = next;
        }
        return prev;
    }
}