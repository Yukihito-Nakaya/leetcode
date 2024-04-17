# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def smallestFromLeaf(self, root: Optional[TreeNode]) -> str:
        def dfs(root, path):
            if root == None: return
            path.append(chr(root.val + ord('a')))
            if root.left == None and root.right == None:
                self.res = min(self.res, ''.join(path[::-1]))
            dfs(root.left, path)
            dfs(root.right, path)
            path.pop()
        self.res = '~'
        dfs(root, [])
        return self.res