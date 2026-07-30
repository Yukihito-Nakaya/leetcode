class Solution:
    def smallestPalindrome(self, s: str) -> str:
        from collections import Counter
        
        count = Counter(s)

        half = []
        middle = ''
        
        for char in sorted(count.keys()):
            freq = count[char]
            if freq % 2 == 1:
                if middle == '':
                    middle = char
                else:
                    return "" 
            half.append(char * (freq // 2))
        
        first_half = ''.join(half)
        return first_half + middle + first_half[::-1]