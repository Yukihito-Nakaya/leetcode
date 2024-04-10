class Solution:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:
        deck.sort(reverse = True)
        dq = deque()
        l = len(deck)
        dq.appendleft(deck[0])
        for i in range(1,l):
            x = dq.pop()
            dq.appendleft(x)
            dq.appendleft(deck[i])
        
        ans = []
        while dq:
            ans.append(dq.popleft())

        return ans
    
# another solution

class Solution2:
    def deckRevealedIncreasing(self, deck: List[int]) -> List[int]:
        deck.sort()
        dq = deque()
        l = len(deck)
        dq.appendleft(deck[l-1])
        for i in range(l-2,-1,-1):
            x = dq.pop()
            dq.appendleft(x)
            dq.appendleft(deck[i])
        
        ans = []
        while dq:
            ans.append(dq.popleft())

        return ans