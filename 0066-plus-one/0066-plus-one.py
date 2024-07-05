class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        a=""
        c=[]
        for i in digits:
            a+=str(i)
        b=int(a)+1
        for j in str(b):
            c.append(int(j))
        return c
        