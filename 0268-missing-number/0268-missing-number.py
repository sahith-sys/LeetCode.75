class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        sum2 = 0
        sums = 0
        for i in range(n):
            sums = sums + nums[i]
        sums2 = (n*(n+1))//2
        return sums2 - sums

        