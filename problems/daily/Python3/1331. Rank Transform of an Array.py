class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        tent = {}
        sortarr = sorted(list(set(arr)))

        for i in range(len(sortarr)):
            tent[sortarr[i]] = i + 1
        
        for i in range(len(arr)):
            arr[i] = tent[arr[i]]

        return arr