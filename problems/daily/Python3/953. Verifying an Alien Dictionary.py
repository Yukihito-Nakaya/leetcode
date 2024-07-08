class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        tent = [0] * len(order)
        for i in range(len(order)):
            tent[ord(order[i]) - ord('a')] = i
        
        for i in range(1,len(words)):
            w1 = words[i - 1]
            w2 = words[i]

            ml = min(len(w1),len(w2))

            if w1[:ml] == w2[:ml] and len(w1) > len(w2):
                return False
            
            for k in range(ml):
                if w1[k] != w2[k]:
                    if tent[ord(w1[k])- ord('a')] > tent[ord(w2[k]) - ord('a')]:
                        return False
                    break
        
        return True