class Solution:
    def smallestRangeI(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0
        min_num = min(nums)
        max_num = max(nums)
        range_diff = max_num - min_num
        if range_diff <= 2 * k:
            return 0
        return range_diff - 2 * k