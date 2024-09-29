class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not t or not s:
            return ""
        dict_t = Counter(t)

        required = len(dict_t)
        l, r = 0, 0
        formed = 0
        window_counts = {}
        ans = float("inf"), None, None
        def find_minimum(x: int) -> int:
            fc = 0
            for i in range(-50, 0):
                fc += c[i]
            if fc >= x:
                return i
            return 0
        while r < len(s):
            character = s[r]
            window_counts[character] = window_counts.get(character, 0) + 1
            if character in dict_t and window_counts[character] == dict_t[character]:
                formed += 1
            while l <= r and formed == required:
                character = s[l]
                if r - l + 1 < ans[0]:
                    ans = (r - l + 1, l, r)
                window_counts[character] -= 1
                if character in dict_t and window_counts[character] < dict_t[character]:
                    formed -= 1
                l += 1    
            r += 1
        return "" if ans[0] == float("inf") else s[ans[1] : ans[2] + 1]
    
# another solution
class Solution:
    def minWindow(self, s: str, t: str) -> str:
        if not t or not s:
            return ""

        dict_t = Counter(t)
        window_cnts = defaultdict(int)
        ans = (float("inf"), None, None)
        l = 0

        def is_valid():
            return all([window_cnts[k] >= dict_t[k] for k in dict_t])

        for r in range(len(s)):
            window_cnts[s[r]] += 1
            while l <= r and is_valid():
                window_size = r - l + 1
                if ans[0] > window_size:
                    ans = (window_size, l, r)
                window_cnts[s[l]] -= 1
                l += 1

        return "" if ans[0] == float("inf") else s[ans[1]:ans[2]+1]