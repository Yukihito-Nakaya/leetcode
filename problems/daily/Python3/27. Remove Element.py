class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        lp = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[lp],nums[i] = nums[i],nums[lp]
                lp += 1
        
        return lp