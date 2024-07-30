class Solution:
    def removeDuplicates(self, s: str) -> str:
        stack= []
        for ch in s:
            if stack:
                if stack[len(stack) -1] == ch:
                    stack.pop()
                else:
                    stack.append(ch)
            else:
                stack.append(ch)
                
        ans = "".join(stack)
        # for ch in stack:
        #     ans += ch
        
        return ans