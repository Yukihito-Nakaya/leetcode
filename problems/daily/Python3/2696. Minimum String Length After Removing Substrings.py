class Solution:
    def minLength(self, s: str) -> int:
        stack = []
        for sh in s:
            if not stack:
                stack.append(sh)
                continue
            if sh == "B" and stack[-1] =="A":
                stack.pop()
            elif sh == "D" and stack[-1] == "C":
                stack.pop()
            else:
                stack.append(sh)
        return len(stack)