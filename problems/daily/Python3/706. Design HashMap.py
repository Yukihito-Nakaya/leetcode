class MyHashMap:

    def __init__(self):
        self.ans = [None] * 1000001
    def put(self, key: int, value: int) -> None:
        self.ans[key] = value
    def get(self, key: int) -> int:
        value = self.ans[key]
        return value if value != None else -1
    def remove(self, key: int) -> None:
        self.ans[key] = None

# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)