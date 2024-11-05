# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = fast = head
        slow_prev = None

        if head.next is None:
            return None
        
        while fast and fast.next:
            slow_prev = slow
            slow = slow.next
            fast = fast.next.next
        
        slow_prev.next = slow.next

        return head