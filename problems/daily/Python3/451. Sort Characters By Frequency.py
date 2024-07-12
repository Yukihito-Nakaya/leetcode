class Solution:
    def frequencySort(self, s: str) -> str:
        count = defaultdict(int)
        for ch in s: count[ch] += 1
        return "".join([a[1]* a[0] for a in sorted([[count[ch],ch] for ch in count], reverse = True)])