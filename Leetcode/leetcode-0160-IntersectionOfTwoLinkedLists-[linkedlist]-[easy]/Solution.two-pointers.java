/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != null || curB != null) {
            if (curA == curB) return curA;
            
            if (curA == null) {
                curA = headB;
            } else if (curB == null) {
                curB = headA;
            } else {
                curA = curA.next;
                curB = curB.next;
            }            
        }
        
        return null;
    }
}