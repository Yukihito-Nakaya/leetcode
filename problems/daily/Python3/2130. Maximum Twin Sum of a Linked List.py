# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        mn = self.middleNode(head)

        fshead = head
        sehead = mn.next

        mn.next = None

        sehead = self.reverseLinkedList(sehead)

        fscur = fshead
        secur = sehead
        ans = 0

        while fscur and secur:
            ans = max(ans,fscur.val + secur.val)
            fscur = fscur.next
            secur = secur.next

        return ans

    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        sl = head
        fs = head.next

        while fs and fs.next:
            sl = sl.next
            fs = fs.next.next
        
        return sl
    
    def reverseLinkedList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head

        while cur:
            nextnode = cur.next
            cur.next = prev
            prev = cur
            cur = nextnode

        return prev