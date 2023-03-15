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
     * @param head: a ListNode
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // write your code here
        if (head == null || head.next == null) {
            return head;
        }

        ListNode left = head;
        ListNode right = head.next;
        ListNode nextStart = swapPairs(right.next);

        right.next = left;
        left.next = nextStart;
        return right;
    }
}