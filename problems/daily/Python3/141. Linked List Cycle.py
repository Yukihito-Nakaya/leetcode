# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        vis = set()
        cur = head

        while cur:
            if cur in vis:
                return True
            vis.add(cur)
            cur = cur.next

        return False
