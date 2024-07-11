class Solution:
    def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
        
        def convert(i: int) -> int:
            if i == 0:
                return mapping[i]
            k,factor = 0 , 1

            while i > 0:
                i , r = divmod(i, 10)
                k += mapping[r] * factor
                factor *= 10
            return k
        
        ans = sorted(range(len(nums)), key=lambda i: convert(nums[i]))
        return [nums[i] for i in ans]

# class Solution:
#     def sortJumbled(self, mapping: List[int], nums: List[int]) -> List[int]:
#         def mapping(i:int):
#             if i == 0:
#                 return mapping[i]
            
#             map_nums = 0
#             tent = 1

#             while i > 0:
#                 digit = i % 10
#                 map_digit = mapping[digit]
#                 map_nums += map_digit * tent
#                 tent *= 10

#                 i = i // 10
#             return map_nums
        
#         nums.sort(key = mapping)
#         return nums