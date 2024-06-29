"""class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        arr = []
        i,j = 0,k-1
        while j<len(nums):
            arr.append((sum(nums[i:j+1]))/k)
            i+=1
            j+=1
        return max(arr)"""
        

"""class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        
        i,j = 0,k-1
        avg,maxavg = 0,0
        if len(nums) == 1:
            return nums[0]
        while j<len(nums):
            avg = sum(nums[i:j+1])/k
            maxavg = max(maxavg,avg)
            i+=1
            j+=1
        return maxavg"""
from typing import List

class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        
        current_sum = sum(nums[:k])
        max_sum = current_sum
        
        
        for i in range(k, len(nums)):
            
            current_sum = current_sum - nums[i - k] + nums[i]
            max_sum = max(max_sum, current_sum)
        
        
        return max_sum / k
