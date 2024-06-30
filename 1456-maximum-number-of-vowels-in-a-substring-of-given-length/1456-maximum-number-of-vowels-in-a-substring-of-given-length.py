class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vow = "aeiou"
        sum = 0
        for l in s[:k]:
            if l in vow:
                sum = sum +1
        
        
        maxi = 0
        for i in range(k,len(s)):
            if s[i-k] in vow:
                sum = sum - 1
                
            if s[i] in vow:
                sum = sum + 1
            maxi = max(maxi,sum)
            
        return maxi

        