class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        fq = Counter(words[0])
        for ch in words:
            fq &= Counter(ch)
        return list(fq.elements())