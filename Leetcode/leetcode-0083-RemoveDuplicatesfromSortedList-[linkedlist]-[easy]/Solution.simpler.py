# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        visited = -10000;
        cur = head
        prev = None
        while (cur != None):
            if (visited == -10000 or visited != cur.val):
                visited = cur.val
                prev = cur
                cur = cur.next
            else:
                cur = cur.next
                prev.next = cur
        
        return head