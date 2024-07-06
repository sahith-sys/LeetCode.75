class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        k = 0
        for i in range(len(nums)):
            if nums[i]%3 != 0:
                k+=1
        return k

        