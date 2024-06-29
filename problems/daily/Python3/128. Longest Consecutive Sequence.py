class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        ans = 0
        tent = set(nums)
        for n in nums:
            if n - 1 not in tent:
                curr = 1
                while n + 1 in tent:
                    curr += 1
                    n += 1
                ans = max(ans, curr)
        return ans
    
# another solution
class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        ans = 0
        tent = set(nums)

        for i in nums:
            if i not in tent:
                continue
            tent.remove(i)
            curr = 1
            c =1
            while i + c in tent:
                tent.remove(i + c)
                curr += 1
                c += 1
            
            c = 1
            while i - c in tent:
                tent.remove(i - c)
                curr += 1
                c += 1
            
            ans = max(ans, curr)
        return ans