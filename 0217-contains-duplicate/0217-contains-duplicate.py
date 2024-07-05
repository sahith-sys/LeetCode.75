class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums1 = set(nums)
        return False if len(nums1) == len(nums) else True
        