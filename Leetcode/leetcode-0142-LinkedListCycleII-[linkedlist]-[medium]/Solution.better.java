/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    	ListNode fast, slow; 
    	fast = slow = head; 
    	while (fast != null && fast.next != null) { 
    		//第一步：判断链表是否存在环 
    		slow = slow.next; 
    		fast = fast.next.next; 
    		if (slow == fast) { 
    			//链表存在环 
    			break; 
    		} 
    	} 
    
    	if ((fast == null) || (fast.next == null)) { 
    		//链表不存在环 
    		return null; 
    	} 
    	//第二步：寻找环的入口点 
    	slow = head; 
    	//让slow回到链表的起点，fast留在相遇点 
    	while (slow != fast) { 
    		//当slow和fast再次相遇时，那个点就是环的入口点 
    		slow = slow.next; 
    		fast = fast.next; 
    	} 
        
    	return slow; 
    }
}