class Solution:
    def countTriplets(self, arr: List[int]) -> int:
        l = len(arr)
        pre = [0] * (l+1)
        ans = 0

        for i in range(l):
            pre[i + 1] = pre[i] ^ arr[i]

        for i in range(l):
            for k in range(i+1,l):
                if pre[i] == pre[k + 1]:
                    ans += (k - i)
        return ans