class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        #尺取り法 (使用条件：ウィンドウが大きくなるほど条件が悪化する方向にしか動かない、単調性)
        left = 0
        count = defaultdict(int)
        ans = 0

        for right in range(len(nums)):
            count[nums[right]] += 1
            while count[nums[right]] > k:
                count[nums[left]] -= 1
                left += 1
            ans = max(ans, right - left + 1)

        return ans