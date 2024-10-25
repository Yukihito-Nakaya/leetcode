# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head
        stack = []
        while cur:
            while stack and stack[-1].val < cur.val:
                a = stack.pop()
            stack.append(cur)
            cur = cur.next
        
        nxt = None
        while stack:
            cur = stack.pop()
            cur.next = nxt
            nxt = cur
        
        return cur
    
    #another solution

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        r_head = self.rLinkedList(head)
        tent = ListNode(0)
        tent.next = r_head
        prev = tent
        cur = r_head
        maxv = cur.val

        while cur:
            if cur.val < maxv:
                prev.next = cur.next
            else:
                maxv = cur.val
                prev = cur
            cur = cur.next
        
        return self.rLinkedList(tent.next)

    
    def rLinkedList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        cur = head

        while cur:
            next_node = cur.next
            cur.next = prev
            prev = cur
            cur = next_node
        
        return prev