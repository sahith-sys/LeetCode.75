import math
class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        closest = float('inf')
        for i in range(len(nums)):
            if (max(0,nums[i])-min(0,nums[i]))<abs(closest):
                closest = nums[i]
            elif max(0,nums[i])-min(0,nums[i])==abs(closest):
                closest = max(closest,nums[i])
        return closest