class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        # l = len(nums)
        # for sp in range(l-1):
        #     for ep in range(sp+1, l):
        #         subsum = sum(nums[sp:ep+1])
        #         if subsum ==0 and k == 0:
        #             return True
        #         if k != 0 and subsum % k == 0:  
        #             return True
        # return False
        map = {0: -1}  # To handle the case where the sub-array starts from index 0
        sum = 0

        for i in range(len(nums)):
            sum += nums[i]
            rem = sum % k

            if rem in map:
                if i - map[rem] > 1:
                    return True
            else:
                map[rem] = i

        return False