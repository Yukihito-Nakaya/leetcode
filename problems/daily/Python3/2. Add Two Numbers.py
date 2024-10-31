# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        ans = ListNode(0)
        tent = ans
        cur1 = l1
        cur2 = l2

        ca = 0

        while cur1 or cur2 or ca != 0:
            cur1_val = cur1.val if cur1 else 0
            cur2_val = cur2.val if cur2 else 0

            sumval = cur1_val + cur2_val + ca
            ca = sumval // 10
            tent.next = ListNode(sumval % 10)
            tent = tent.next

            cur1 = cur1.next if cur1 else None
            cur2 = cur2.next if cur2 else None
            
        return ans.next