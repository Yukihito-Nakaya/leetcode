class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        ans = set()
        for i in nums:
            if i not in ans:
                ans.add(i)
            else:
                ans.remove(i)
        return list(ans)