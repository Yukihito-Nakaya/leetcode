class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        freq_map = defaultdict(int)
        for i in nums:
            freq_map[i] += 1
            if freq_map[i] > 1:
                return True
        return False