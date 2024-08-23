class Solution:
    def reverseVowels(self, s: str) -> str:
        ch = list(s)
        lp = 0
        rp = len(s) - 1
        vow = set([
            'a','i','u','e','o','A','I','U','E','O'
        ])
        while lp < rp:
            while lp < rp and ch[lp] not in vow:
                lp += 1
            while lp < rp and ch[rp] not in vow:
                rp -= 1
            
            if lp < rp:
                ch[lp],ch[rp] = ch[rp],ch[lp]
                lp += 1
                rp -= 1
        return ''.join(ch)
        