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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            if (carry > 0) {
                sum += carry;
            }
            
            int nodeVal = sum % 10;
            carry = sum / 10;
            ListNode newNode = new ListNode(nodeVal);
            cur.next = newNode;
            cur = cur.next;
        }
        
        if (carry > 0) {
            ListNode newNode = new ListNode(1);
            cur.next = newNode;
            cur = cur.next;
        }
        
        return dummy.next;
    }
}