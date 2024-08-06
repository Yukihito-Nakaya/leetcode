# class Solution:
#     def maxScore(self, s: str) -> int:
#         l = len(s)
#         zpsum = [0] * (l + 1)
#         opsum = [0] * (l + 1)

#         for i in range(l):
#             opsum[i + 1] = zpsum[i]
#             if s[i] == '1':
#                 opsum[i+1] += 1
            
#             zpsum[i+1] = zpsum[i]
#             if s[i] == '0':
#                 zpsum[i+1] += 1

#         ans = 0
#         for i in range(l-1):
#             lzc = zpsum[i + 1] - zpsum[0]
#             roc = opsum[l] - opsum[i + 1]
#             ans = max(ans, lzc + roc)
        
#         return ans

class Solution:
    def maxScore(self, s: str) -> int:
        l = 1
        ans = 0
        while 1:
            if l == len(s):
                break
            ans = max(ans,s[:l].count('0') + s[l:].count('1'))

            l += 1
        return ans