# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        l = 0
        cur = head
        while cur:
            l += 1
            cur = cur.next
        
        m = l - n + 1
        ans = ListNode(-1)
        ans.next= head

        cur = ans

        while m > 1:
            m -= 1
            cur = cur.next
        
        cur.next  = cur.next.next

        return ans.next
    

#another solutions

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        ans = ListNode(-1,head)
        fs = se = ans

        for i in range(n):
            fs = fs.next

        while fs.next:
            fs = fs.next
            se = se.next
        
        se.next = se.next.next

        return ans.next