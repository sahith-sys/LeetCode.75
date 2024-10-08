class Solution:
    def convertDateToBinary(self, date: str) -> str:
        x = bin(int(date[0:4]))[2:]
        y = bin(int(date[5:7]))[2:]
        z = bin(int(date[8:]))[2:]
        res = "{}-{}-{}".format(x,y,z)
        return res
        