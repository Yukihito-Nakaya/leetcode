# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        if not head or k == 0:
            return head

        length = 1
        tail = head
        while tail.next:
            tail = tail.next
            length += 1

        k = k % length
        if k == 0:
            return head
        
        tail.next = head
        new_head = length - k
        new_tail = tail
        while new_head:
            new_tail = new_tail.next
            new_head -= 1

        ans = new_tail.next
        new_tail.next = None
        return ans

#another solution
class Solution:
    def rotateRight(self, head, k):
        if not head or not head.next or k == 0: return head  

        length = 1
        tail = head
        while tail.next:
            tail = tail.next
            length += 1  

        k %= length
        if k == 0: return head 

        tail.next = head  # circular

        steps = length - k
        newtail = head
        for _ in range(1, steps):
            newtail = newtail.next  

        newhead = newtail.next  
        newtail.next = None  

        return newhead