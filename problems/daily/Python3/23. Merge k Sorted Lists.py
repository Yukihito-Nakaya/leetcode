# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def margeTwoLists(self, l1: Optional[ListNode], l2: Optional[ListNode]):
        tent = ListNode(-1)
        cur = tent
        while l1 and l2:

            if l1.val < l2.val:
                cur.next = l1
                l1 = l1.next
            else:
                cur.next = l2
                l2 = l2.next

            cur = cur.next

        if l1:
            cur.next = l1
        else:
            cur.next = l2

        return tent.next
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if len(lists) == 1:
            return lists[0]
        elif len(lists) == 0:
            return None
        
        l = len(lists)

        sort_list1 = self.mergeKLists(lists[:l//2])
        sort_list2 = self.mergeKLists(lists[l//2:])

        return self.margeTwoLists(sort_list1,sort_list2)