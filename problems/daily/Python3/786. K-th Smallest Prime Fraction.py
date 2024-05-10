class Solution:
    def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
        l = len(arr)
        left,right = 0,1
        ans = []

        while left <= right:
            mid = left + (right - left) / 2
            j, total, num, den = 1,0,0,0

            maxFrac = 0
            for i in range(l):
                while j < l and arr[i] > arr[j] * mid:
                    j += 1
                
                total += l - j

                if j < l and maxFrac < arr[i] * 1.0 / arr[j]:
                    maxFrac = arr[i] * 1.0 / arr[j]
                    num,den = i,j
            
            if total == k:
                ans = [arr[num],arr[den]]
                break

            if total > k:
                right = mid
            else:
                left = mid

        return ans