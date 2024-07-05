class Solution:
    def addedInteger(self, nums1: List[int], nums2: List[int]) -> int:
        sums,sums2 = 0,0
        for i in range(len(nums1)):
            sums = sums + nums1[i]
        for j in range(len(nums2)):
            sums2 = sums2 + nums2[j]
        return (sums2-sums)//len(nums1)