class Solution:
    def replaceWords(self, dictionary: List[str], sentence: str) -> str:
        # ans = sentence.split()
        # for i in range(len(ans)):
        #     for ch in dictionary:
        #         if ans[i].startswith(ch):
        #             ans[i] = ch
        #             break
        # return ' '.join(ans)
        
        words = sentence.split(' ')
        ans = ''

        for i in range(len(words)):
            for ch in dictionary:
                if words[i][0:len(ch)] == ch:
                    words[i] = ch
        for ch in words:
            ans += ch+' '
        
        return ans.strip()