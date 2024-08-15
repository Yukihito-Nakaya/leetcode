class Solution:
    def lemonadeChange(self, bills: List[int]) -> bool:
        fd,td =0,0
        for i in bills:
            if i == 5:
                fd += 1
            elif i == 10:
                td += 1
                fd -= 1
            else:
                if td > 0:
                    td -= 1
                    fd -= 1
                else:
                    fd -= 3
            if fd < 0 or td < 0:
                return False
        return True
