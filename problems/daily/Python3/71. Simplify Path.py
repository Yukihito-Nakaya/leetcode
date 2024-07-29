class Solution:
    def simplifyPath(self, path: str) -> str:
        parts = [ part for part in path.split('/') if part ]
        ans = []

        for part in parts:
            if part == ".":
                continue
            elif part == "..":
                if ans:
                    ans.pop()
            elif part == "":
                if ans:
                    ans.pop()
            else:
                ans.append(part)
        
        return '/' + '/'.join(ans)
        