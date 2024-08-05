class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        c =  Counter(arr)
        for ch in arr:
            if c[ch] == 1:
                k -= 1
                if k == 0:
                    return ch
                
        return ''