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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        
        ListNode head = null;
        ListNode cur = null;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
               heap.offer(lists[i]);             
            }
        }
        
        if (heap.isEmpty()) {
            return null;
        }
        
        head = heap.poll();
        cur = head;
        
        if (cur.next != null) {
            heap.offer(cur.next);
        }
        
        while (!heap.isEmpty()) {
            ListNode temp = heap.poll();
            cur.next = temp;
            cur = cur.next;
            if (temp.next != null) {
                heap.offer(temp.next);
            }
        }
        
        return head;
    }
}