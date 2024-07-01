class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        maxi = 0
        sums = 0
        
        for x in gain:
            sums = sums + x
            maxi = max(maxi,sums)
        return maxi 
        