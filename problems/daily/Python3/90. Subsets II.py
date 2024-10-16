from copy import deepcopy as cp
class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        l = len(nums)
        nums.sort()
        ans = []
        tent =[]

        def rec(i):
            if i == l:
                ans.append(cp(tent))
                return
            c = nums[i]
            j = i
            for k in range(i+1,l):
                if nums[k] == c:
                    j = k
                else:
                    break
            
            counts = j - i + 1

            rec(i + counts)

            for k in range(counts):
                tent.append(c)
                rec(i + counts)
            
            for k in range(counts):
                tent.pop()

            return
        rec(0)
        return ans