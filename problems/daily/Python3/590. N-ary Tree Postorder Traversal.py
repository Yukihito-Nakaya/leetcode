"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def postorder(self, root: 'Node') -> List[int]:
        ans = []
        if not root:
            return ans
        def dfs(root):
            for i in root.children:
                dfs(i)
            ans.append(root.val)
        
        dfs(root)
        return ans