class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        kind = set(['(','{','['])
        pair = {
            ')': '(',
            '}': '{',
            ']': '['
        }

        for i in range(len(s)):
            if s[i] in kind:
                stack.append(s[i])
            else:
                if stack and pair[s[i]] == stack[-1]:
                    stack.pop()
                else:
                    return False
        return len(stack) == 0