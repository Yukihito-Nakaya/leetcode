def gcd(a: int, b:int) -> int:
    if b > a:
        a, b = b, a
    r = a % b

    if r == 0:
        return b
    return gcd(b,r)

class Solution:
    def findGCD(self, nums: List[int]) -> int:
        return gcd(max(nums),min(nums))