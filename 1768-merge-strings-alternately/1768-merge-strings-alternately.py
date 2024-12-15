class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        stri = ""
        p1 = 0
        p2 = 0
        for i in range(len(word1) + len(word2)):
            if i % 2 == 0 and p1 < len(word1):
                stri += word1[p1]
                p1 += 1
            elif i % 2 != 0 and p2 < len(word2):
                stri += word2[p2]
                p2 += 1
        
        if p1 < len(word1):
            stri += word1[p1:]
        if p2 < len(word2):
            stri += word2[p2:]
        return stri