"""class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        arr = []
        for i in range(len(nums)):
            arr.append(nums[nums[i]])
        return arr
        """

class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        x = len(nums)
        for i in range(x):
            nums.append(nums[nums[i]])
        return nums[x::]
        