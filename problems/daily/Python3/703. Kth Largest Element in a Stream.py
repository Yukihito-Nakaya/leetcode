class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.nums = sorted(nums,reverse=True)
        self.n = len(nums)
    def add(self, val: int) -> int:
        if self.n == 0:
            self.nums.append(val)
            self.n += 1
            return val
        if self.n < self.k:
            self.nums.append(val)
            self.n += 1
            self.nums.sort(reverse=True)
            return self.nums[self.k - 1]
        if val <= self.nums[-1]:
            return self.nums[self.k - 1]
        self.nums.append(val)
        self.nums.sort(reverse=True)
        self.nums.pop()
        return self.nums[self.k - 1]
    


# Your KthLargest object will be instantiated and called as such:
# obj = KthLargest(k, nums)
# param_1 = obj.add(val)