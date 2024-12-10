class Solution:
    def maximumLength(self, s: str) -> int:
        tent = []
        for i in range(len(s)):
            index = i
            while index < len(s) and s[index] == s[i]:
                tent.append(s[i:index+1])
                index += 1
            
        counts = Counter(tent)
        ans = 0

        for i , k in counts.items():
            if k >= 3:
               if len(i)>ans:
                     ans = len(i)
        if ans == 0:
            return -1
        
        return ans