class Solution:
    def maximumSwap(self, num: int) -> int:
        numlist = list(str(num))
        l = len(numlist)
        for i in range(l-1):
            if numlist[i] < numlist[i+1]: break
        else: return num
        mi,mv = i+1,numlist[i+1]

        for k in  range(i +1,l):
            if mv <= numlist[k]: mi ,mv = k,numlist[k]
        li = i

        for k in range(i, -1,-1):
            if numlist[k] < mv: li = k
        numlist[mi],numlist[li] = numlist[li],numlist[mi]
        return int(''.join(numlist))