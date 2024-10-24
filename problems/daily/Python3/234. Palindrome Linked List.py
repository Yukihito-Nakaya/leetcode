    # Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        sl = fs = head

        while fs and fs.next:
            sl_pr = sl
            sl = sl.next
            fs = fs.next.next

        prev = None
        cur = sl

        while cur:
            tent = cur.next
            cur.next = prev
            prev = cur
            cur = tent

        fs_cur = head
        sec_cur = prev

        while fs_cur and sec_cur:
            if fs_cur.val != sec_cur.val:
                return False
            fs_cur = fs_cur.next

            sec_cur = sec_cur.next

        return True