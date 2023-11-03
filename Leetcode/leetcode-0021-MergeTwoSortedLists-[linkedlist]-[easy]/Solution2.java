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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode ptrHead = null;
        ListNode cur = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (cur == null && ptrHead == null) {
                    cur = list1;
                    ptrHead = list1;
                } else {
                    cur.next = list1;
                    cur = cur.next;
                }

                list1 = list1.next;
            } else {
                if (cur == null && ptrHead == null) {
                    cur = list2;
                    ptrHead = list2;
                } else {
                    cur.next = list2;
                    cur = cur.next;
                }

                list2 = list2.next;
            }
        }

        if (list1 != null) {
            cur.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            cur.next = list2;
            list2 = list2.next;
        }

        return ptrHead;
    }
}