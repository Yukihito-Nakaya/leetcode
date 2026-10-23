class Solution:
    def sortPermutation(self, nums: List[int]) -> int:
        k = -1
        for i, c in enumerate(nums):
            if c != i:
                k &= c
                if not k:
                    return 0

        return max(k, 0)

# another solution
class Solution:
    def sortPermutation(self, nums: List[int]) -> int:

        return max(reduce(and_,(c for i, c in enumerate(nums) if c != i), -1), 0)