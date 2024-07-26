class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        tent = []
        for i in nums:
            tent += [str(i)]
        
        l = len(tent)

        for i in range(l):
            for k in range(i+1 , l):
                if str(tent[i] + str(tent[k]) > str(tent[k]) + str(tent[i])):
                    continue
                else:
                    tent[i],tent[k] = tent[k],tent[i]
        
        ans = ''.join(tent)

        if int(ans) == 0:
            return "0"
        
        return ans