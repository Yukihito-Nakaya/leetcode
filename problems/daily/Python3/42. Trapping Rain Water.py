class Solution:
    def trap(self, height: List[int]) -> int:
        k = len(height) - 1
        maxleft = height[0]
        maxright = height[k]  
        i = 0
        ans = 0
        
        while i < k:
            if maxleft <= maxright:
                ans += maxleft - height[i]
                i += 1
                maxleft = max(maxleft, height[i])
            else:
                ans += maxright - height[k]
                k -= 1
                maxright = max(maxright, height[k])
        return ans
                 
