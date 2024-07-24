class Solution:
    def scoreOfParentheses(self, s: str) -> int:
        ans_stk = [0]
        for ch in s:
            if ch == '(':
                ans_stk.append(0)
            else:
                value = max(2 * ans_stk.pop(),1)
                ans_stk[-1] += value
        return ans_stk.pop()