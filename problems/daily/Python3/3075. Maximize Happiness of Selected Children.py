class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
       happiness.sort(reverse = True)
       ans = 0
       for i in range(k):
           ans += max(happiness[i] - i,0)
       return ans

# anther solution
class Solution:
    def maximumHappinessSum(self, happiness: List[int], k: int) -> int:
        happiness.sort(reverse=True)
        ans = 0
        for i in range(k):
            if happiness[i] - i < 0 :
                break
            ans += (happiness[i] - i)
        return ans