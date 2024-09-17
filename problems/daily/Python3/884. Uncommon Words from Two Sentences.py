class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        ws1 = s1.split()
        ws2 = s2.split()

        words = ws1 + ws2

        wc = Counter(words)

        return [s for  s in wc if wc[s] == 1]