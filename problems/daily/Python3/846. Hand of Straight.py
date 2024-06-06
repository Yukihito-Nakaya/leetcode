class Solution:
    def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
        if len(hand) % groupSize != 0:
            return False
        c = Counter(hand)
        sort = sorted(c.keys())

        for i in sort:
            if c[i] > 0:
                sc = c[i]
                for k in range(i, i + groupSize):
                    if c[k] < sc:
                        return False
                    c[k] -= sc
        
        return True