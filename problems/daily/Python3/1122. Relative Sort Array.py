class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        c = 0
        for i in range(len(arr2)):
            for k in range(len(arr1)):
                if arr1[k] == arr2[i]:
                    arr1[c], arr1[k] = arr1[k],arr1[c]
                    c += 1
        arr1[c:] = sorted(arr1[c:])
        return arr1
    
# another soluttion
class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        arr1.sort()
        ans = []

        for i in arr2:
            k = arr1.index(i)
            while k < len(arr1) and i == arr1[k]:
                ans.append(arr1.pop(j))

            return ans + arr1