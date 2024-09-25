class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        bus = collections.defaultdict(int)
        l = 0
        ans = 0

        for i in range(len(fruits)):
            bus[fruits[i]] += 1

            while len(bus.keys()) > 2:
                bus[fruits[l]] -= 1
                if bus[fruits[l]] == 0:
                    bus.pop(fruits[l])
                l += 1
            ans = max(ans, i - l + 1)
        
        return ans