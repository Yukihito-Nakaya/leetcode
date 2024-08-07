class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l = len(nums)

        psum = [0] * l
        ssum = [0] * l

        psum[0] = 1  
        ssum[-1] = 1 

        for i in range(1, l):
            psum[i] = psum[i-1] * nums[i-1]

        for i in reversed(range(l - 1)):
            ssum[i] = ssum[i+1] * nums[i+1]

        ans = [0] * l
        for i in range(l): 
            ans[i] = ssum[i] * psum[i]

        return ans

        # for i in range(len(nums)):
        #     v = 1
        #     for k in range(len(nums)):
        #         if k == i:
        #             continue
        #         elif nums[k] == 0:
        #             v = 0
        #             break
        #         else:
        #             v *= nums[k]

            # lv = 1
            # rv = 1
            # cpl,cpr = i -1, i +1
            # while cpl >= 0:
            #     lv *= nums[cpl]
            #     cpl -= 1
            # while cpr < len(nums):
            #     rv *= nums[cpr]
            #     cpr += 1
            
        #     ans.append(v)
        # return ans