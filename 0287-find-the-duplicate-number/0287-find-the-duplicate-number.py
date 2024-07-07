class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        s = set(nums)
        sl = len(s)
        n = len(nums)
        sums,sums1 = 0,0
        for i in range(n):
            sums = sums + nums[i]
        """for j in range (sl):
            sums1 = sums1 + s(j)"""
        sums1 = sum(s)
        return (sums - sums1)//(n-sl)


        