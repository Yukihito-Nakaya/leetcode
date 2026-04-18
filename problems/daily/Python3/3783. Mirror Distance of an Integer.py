class Solution:
    def mirrorDistance(self, n: int) -> int:
        mirrored = int(str(n)[::-1])
        return abs(n - mirrored)