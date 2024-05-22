class Solution:
    def partition(self, s: str) -> List[List[str]]:
        ans = []
        l = len(s)

        def search(index, curr):
            if index >= l:
                ans.append(curr.copy())
            for i in range(index, l):
                tent = s[index:i + 1]
                if tent == tent[::-1]:
                    curr.append(tent)
                    search(i + 1, curr)
                    curr.pop()
        
        search(0, [])
        return ans