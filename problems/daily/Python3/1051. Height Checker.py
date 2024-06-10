class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        check  = sorted(heights)
        ans = 0
        for i in range(len(heights)):
            if check[i] != heights[i]:
                ans += 1
        return ans