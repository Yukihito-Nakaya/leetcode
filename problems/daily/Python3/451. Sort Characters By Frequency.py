class Solution:
    def frequencySort(self, s: str) -> str:
        count = defaultdict(int)
        for ch in s: count[ch] += 1
        return "".join([a[1]* a[0] for a in sorted([[count[ch],ch] for ch in count], reverse = True)])
    
#another solution
class Solution:
    def frequencySort(self, s: str) -> str:
        if not s: return s
        count = collections.Counter(s)
        maxq = max(count.values())
        buckets = [[] for _ in range(maxq + 1)]

        for ch, c in count.items():
            buckets[c].append(ch)
        res = []

        for i in range(maxq, 0, -1):
            for ch in buckets[i]:
                res.append(ch * i)
        return "".join(res)