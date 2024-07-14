class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        arr = []
        for i in range(len(nums)):
            arr.append(nums[nums[i]])
        return arr
        