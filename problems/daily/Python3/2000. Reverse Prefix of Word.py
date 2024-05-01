class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
       c = word.find(ch)
       if c != -1:
        return word[:c+1][::-1] + word[c+1:]
       return word