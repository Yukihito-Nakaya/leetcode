# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution:
#     def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
#         if not head:
#             return 
#         current = head
#         newHead = dummy = ListNode(0)
#         number = 0

#         while current:
#             number = number * 10 + current.val
#             current = current.next

#         number *= 2
#         if number == 0:
#             return ListNode(0)
        
#         number = []

#         while number > 0:
#             digit = number % 10
#             number =  number // 10
#             number.append(digit)

#         for num in reversed(number):
#             dummy.next = ListNode(num)
#             dummy = dummy.next

#         return newHead.next

#another solution

class Solution:
    def doubleIt(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head.val > 4:
            head = ListNode(0, head)
        node = head
        while node:
            node.val = (node.val * 2) % 10
            if node.next and node.next.val > 4:
                node.val += 1
            node = node.next
        return head