class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        for i in range(k):
            index = nums.index(min(nums))
            nums[index] *= multiplier
        return nums
    
#another solution
class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        l = len(nums)
        q = [(nums[i], i) for i in range(l)]
        heapq.heapify(q)

        while k > 0:
            val, index = heapq.heappop(q)
            nums[index] *= multiplier
            heapq.heappush(q, (nums[index], index))
            k -= 1
        return nums