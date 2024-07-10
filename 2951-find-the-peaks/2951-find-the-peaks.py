class Solution:
    def findPeaks(self, mountain: List[int]) -> List[int]:
        arr = []
        for i in range(1,len(mountain)-1):
            if mountain[i-1]<mountain[i] and mountain[i]>mountain[i+1]:
                arr.append(i)
        return arr

        