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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        System.out.println("head.val" + head.val);
        
        ListNode prev = dummy;;
        while (prev != null) {
            prev = reverseKNodes(prev, k);
        }

        return dummy.next;
    }
    
    public ListNode reverseKNodes(ListNode prev, int k) {
        // System.out.println("prev.val at beginning: " + prev.val);
        if (prev == null) {
            return null;
        }
        
        ListNode temp = prev.next;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return null;
            }
            
            temp = temp.next;
        }
        
        ListNode curPrev = prev;
        ListNode reversedEnd = prev.next;
        ListNode curStart = prev.next;
        for (int i = 0; i < k; i++) {
            ListNode tempNext = curStart.next;
            curStart.next = curPrev;
            curPrev = curStart;
            curStart = tempNext;
        }
        
        ListNode reversedStart = curPrev;
        // System.out.println("reversedStart.val" + reversedStart.val);
        ListNode nextPrev = prev.next;
        // System.out.println("nextPrev.val" + nextPrev.val);
        
        nextPrev.next = curStart;
        // System.out.println("curStart.val" + curStart.val);
        
        prev.next = reversedStart;
        // System.out.println("prev.next.val" + prev.next.val);
        // System.out.println("==================");
        
        return nextPrev;
    }
}