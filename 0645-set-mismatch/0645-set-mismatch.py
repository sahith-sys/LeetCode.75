class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        s = set(nums)
        s1 = sum(nums)
        s2 = sum(s)
        n = len(nums)
        arr = []
        arr.append(s1-s2)
        x = (n*(n+1))//2
        arr.append(x - s2)
        return arr
        