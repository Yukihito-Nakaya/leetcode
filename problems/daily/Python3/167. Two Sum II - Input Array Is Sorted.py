class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        lp , rp = 0, len(numbers)-1
        while lp < rp:
            check = numbers[rp] + numbers[lp]
            if check == target:
                return [lp + 1,rp +1]
            elif check > target:
                rp -= 1
            else:
                lp += 1
        return [-1,1]