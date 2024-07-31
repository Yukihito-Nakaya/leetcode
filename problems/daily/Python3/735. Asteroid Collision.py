class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        ans = []
        for i in asteroids:
            if ans:
                if i < 0:
                    while ans:
                        if ans[len(ans) - 1] + i == 0:
                            ans.pop()
                            break
                        elif ans[len(ans) - 1] < 0:
                            ans.append(i)
                            break
                        elif ans[len(ans) - 1] > 0 and ans[len(ans) - 1] <  abs(i):
                            ans.pop()
                            if not ans:
                                ans.append(i)
                                break
                        else:
                            break       
                else:
                    ans.append(i)
                            
            else:
                ans.append(i)
        
        return ans
    
# organize aolution

class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        ans = []
        for i in asteroids:
            if i > 0:
                ans.append(i)
            else:
                while ans and ans[len(ans) - 1] > 0 and -i > ans[len(ans) - 1]:
                    ans.pop()
                if ans:
                    if ans[len(ans) - 1] < 0:
                        ans.append(i)
                    elif ans[len(ans) - 1] == -i:
                        ans.pop()
                else:
                    ans.append(i)
        
        return ans