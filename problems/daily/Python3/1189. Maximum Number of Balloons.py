class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        ans = [0] * 5

        for c in text:
            if c == 'b':
                ans[0] += 1
            elif c == 'a':
                ans[1] += 1
            elif c == 'l':
                ans[2] += 1
            elif c == 'o':
                ans[3] += 1
            elif c == 'n':
                ans[4] += 1

        ans[2] //= 2
        ans[3] //= 2

        return min(ans)
    
#another solution
class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        f = Counter(text)
        return min(f["b"], f["a"], f["l"] >> 1, f["o"] >> 1, f["n"])
    
#another solution
class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        d = defaultdict(int)
        word = "balloon"
        for t in text:
            if t in word:
                d[t] +=1
        
        if any(t not in d for t in word):
            return 0
        else:
            return min(d['b']//1, d['a']//1, d['l']//2, d['o']//2, d['n']//1)