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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode mid = findMid(head);
        ListNode right = mid.next;
        mid.next = null;
        
        ListNode leftHead = sortList(head);
        ListNode rightRight = sortList(right);
        
        ListNode newHead = merge(leftHead, rightRight);
    
        return newHead;
    }
    
    public ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
    
    public ListNode merge(ListNode leftHead, ListNode rightHead) {
        ListNode left = leftHead;
        ListNode right = rightHead;
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            
            cur = cur.next;
        }
        
        if (left != null) {
            cur.next = left;
        }
            
        if (right != null) {
            cur.next = right;
        }
            
        return dummy.next;
    }
}