class MinStack:

    def __init__(self):
        self.stack = []
        self.ans = []

    def push(self, val: int) -> None:
        self.stack.append(val)
        if not self.ans or self.ans[-1] >= val:
            self.ans.append(val)

    def pop(self) -> None:
        v = self.stack.pop()
        if self.ans[-1] == v:
            self.ans.pop()

    def top(self) -> int:
        return self.stack[-1]

    def getMin(self) -> int:
        return self.ans[-1]
    
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()