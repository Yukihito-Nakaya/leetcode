class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
        l = len(nums)
        for i in range(1,l): bisect.insort_left(nums,nums.pop(i),0,i)
        return nums
    