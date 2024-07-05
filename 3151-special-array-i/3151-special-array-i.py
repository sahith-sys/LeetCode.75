class Solution:
    def isArraySpecial(self, nums: List[int]) -> bool:
        k = len(nums)-1
        for i in range(1,len(nums)):
            if (nums[i-1] + nums[i])%2 != 0:
                k = k-1
        return True if k == 0 else False

        