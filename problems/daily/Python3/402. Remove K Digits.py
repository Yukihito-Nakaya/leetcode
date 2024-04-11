class Solution:
    def removeKdigits(self, num: str, k: int) -> str:
        if k == 0:
            return num
        if k == len(num):
            return "0"
        stack = []
        for n in num:
            while k and stack and stack[-1] > n:
                stack.pop()
                k -= 1
            stack.append(n)
        while k:
            stack.pop()
            k -= 1
        return "".join(stack).lstrip("0") or "0"