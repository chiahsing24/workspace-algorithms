/**
 * Definition for ListNode
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
    /**
     * @param head: the head of linked list.
     * @return: a middle node of the linked list
     */
    public ListNode middleNode(ListNode head) {
        // write your code here
        if (head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (head.next != null && head.next.next != null) {
            slow = slow.next;
            head = head.next.next;
        }

        return slow;
    }
}