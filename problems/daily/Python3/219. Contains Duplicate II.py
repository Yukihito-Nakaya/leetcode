class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        hash_tent = {}
        for i,num in enumerate(nums):
            if num in hash_tent and abs(hash_tent[num] -  i) <= k:
                return True
            hash_tent[num] = i
        return False