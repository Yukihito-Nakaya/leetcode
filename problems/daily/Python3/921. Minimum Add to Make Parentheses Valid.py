class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        stack =[]
        for sh in s:
            if stack and stack[-1] == '(' and sh == ')':
                stack.pop()
            else:
                stack.append(sh)
        return len(stack)