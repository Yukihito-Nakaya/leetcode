class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        tent = set()
        for i in range(0,floor(math.sqrt(c)) + 1):
            tent.add(i*i)
            if((c-i*i in tent)or(2*i*i==c)):
                return True
        return False